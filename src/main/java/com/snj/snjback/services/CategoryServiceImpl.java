package com.snj.snjback.services;

import com.snj.snjback.documents.Category;
import com.snj.snjback.exeption.ElementAlreadyExistsException;
import com.snj.snjback.exeption.ElementNotFoundException;
import com.snj.snjback.forms.CategoryForm;
import com.snj.snjback.forms.updateForms.CategoryFormUpdate;
import com.snj.snjback.mappers.CategoryMapper;
import com.snj.snjback.documents.dto.CategoryDTO;
import com.snj.snjback.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements ServiceCRUD<String, CategoryForm, CategoryFormUpdate, CategoryDTO> {
    private final CategoryMapper mapper;
    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryMapper mapper, CategoryRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public CategoryDTO add(CategoryForm toAdd) {
        if(!repository.findByname(toAdd.getName()).isEmpty())
            throw new ElementAlreadyExistsException(toAdd.getName());

        Category category= mapper.formToDocument(toAdd);
        category=repository.save(category);
        return mapper.documentToDTO(category);
    }

    @Override
    public List<CategoryDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::documentToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO update(String id, CategoryFormUpdate form) {
        Category category=repository.findById(id).orElseThrow(
                ()->new ElementNotFoundException("La catégorie portant l'id: "+id));

        if(!repository.findByname(form.getName()).isEmpty())
            throw new ElementAlreadyExistsException(form.getName());

        category.setName(form.getName());
        category=repository.save(category);

        return mapper.documentToDTO(category);
    }

    @Override
    public CategoryDTO delete(String id) throws ElementNotFoundException {
        Category category=repository.findById(id).orElseThrow(
                ()->new ElementNotFoundException("La catégorie portant l'id: "+id));
        //delete verify if link to don or project
        repository.delete(category);
        return mapper.documentToDTO(category);
    }


}
