package com.snj.snjback.services;

import com.snj.snjback.entity.Category;
import com.snj.snjback.exeption.ElementAlreadyExistsException;
import com.snj.snjback.exeption.ElementNotFoundException;
import com.snj.snjback.forms.CategoryForm;
import com.snj.snjback.forms.updateForms.CategoryFormUpdate;
import com.snj.snjback.mappers.CategoryMapper;
import com.snj.snjback.entity.dto.CategoryDTO;
import com.snj.snjback.repositories.CategoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryServiceImpl implements ServiceCRUD<Long, CategoryForm, CategoryFormUpdate, CategoryDTO> {
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
        Category category = mapper.formToEntity(toAdd);
        category = repository.save(category);
        return mapper.entityToDto(category);
    }

    @Override
    public List<CategoryDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getOne(Long id) {
        return null;
    }

    @Override
    public CategoryDTO delete(Long id) {
        Category category=repository.findById(id).orElseThrow(
                ElementNotFoundException::new);
//        if(category.getProjects()!=null)throw new ElementNotFoundException();
        repository.delete(category);
        return mapper.entityToDto(category);
    }

    @Override
    public CategoryDTO update(Long id, CategoryFormUpdate categoryForm) {

        Category category=repository.findById(id).orElseThrow(
                ElementNotFoundException::new);

        if(!repository.findByname(categoryForm.getName()).isEmpty())
            throw new ElementAlreadyExistsException(categoryForm.getName());

        category.setName(categoryForm.getName());
        category=repository.save(category);

        return mapper.entityToDto(category);
    }

}
