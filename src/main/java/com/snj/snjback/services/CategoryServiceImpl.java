package com.snj.snjback.services;

import com.snj.snjback.documents.Category;
import com.snj.snjback.documents.dto.DonationDTO;
import com.snj.snjback.exeption.ElementAlreadyExistsException;
import com.snj.snjback.exeption.ElementNotFoundException;
import com.snj.snjback.forms.CategoryForm;
import com.snj.snjback.mappers.CategoryMapper;
import com.snj.snjback.documents.dto.CategoryDTO;
import com.snj.snjback.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements ServiceCRUD<String, CategoryForm, CategoryDTO> {
    private final CategoryMapper mapper;
    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryMapper mapper, CategoryRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public CategoryDTO insert(CategoryForm toAdd) {
        if(!repository.findByname(toAdd.getName()).isEmpty())
            throw new ElementAlreadyExistsException(toAdd.getName());

        Category category= mapper.formToDocument(toAdd);
        category=repository.save(category);
        return mapper.documentToDto(category);
    }

    @Override
    public List<CategoryDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::documentToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getOne(String id) {
        return null;
    }

    @Override
    public DonationDTO delete(String id) {
        return null;
    }

    @Override
    public CategoryDTO update(String id, CategoryForm categoryForm) {

        Category category=repository.findById(id).orElseThrow(
                ()->new ElementNotFoundException("La catégorie portant l'id: "+id));

        if(!repository.findByname(categoryForm.getName()).isEmpty())
            throw new ElementAlreadyExistsException(categoryForm.getName());

        category.setName(categoryForm.getName());
        category=repository.save(category);

        return mapper.documentToDto(category);
    }

}
