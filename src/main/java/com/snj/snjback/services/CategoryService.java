package com.snj.snjback.services;

import com.snj.snjback.documents.Category;
import com.snj.snjback.exeption.ElementAlreadyExistsException;
import com.snj.snjback.exeption.ElementNotFoundException;
import com.snj.snjback.forms.CategorieForm;
import com.snj.snjback.mappers.CategorieMapper;
import com.snj.snjback.documents.dto.CategorieDTO;
import com.snj.snjback.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService implements GeneralService<String,CategorieForm,CategorieDTO> {
    private final CategorieMapper mapper;
    private final CategoryRepository repository;

    public CategoryService(CategorieMapper mapper, CategoryRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public CategorieDTO add(CategorieForm toAdd) {
        if(!repository.findByname(toAdd.getName()).isEmpty())
            throw new ElementAlreadyExistsException(toAdd.getName());

        Category category= mapper.formToDocument(toAdd);
        category=repository.save(category);
        return mapper.documentToDto(category);
    }

    @Override
    public List<CategorieDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::documentToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategorieDTO update(String id, CategorieForm categorieForm) {

        Category category=repository.findById(id).orElseThrow(
                ()->new ElementNotFoundException("La catégorie portant l'id: "+id));

        if(!repository.findByname(categorieForm.getName()).isEmpty())
            throw new ElementAlreadyExistsException(categorieForm.getName());

        category.setName(categorieForm.getName());
        category=repository.save(category);

        return mapper.documentToDto(category);
    }

}
