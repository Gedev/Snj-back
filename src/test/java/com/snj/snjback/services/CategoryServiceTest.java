package com.snj.snjback.services;

import com.snj.snjback.documents.Category;
import com.snj.snjback.documents.dto.CategoryDTO;
import com.snj.snjback.forms.CategoryForm;
import com.snj.snjback.mappers.CategoryMapper;
import com.snj.snjback.repositories.CategoryRepository;
import com.snj.snjback.utils.Data;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@SpringBootTest
class CategoryServiceTest {
    @MockBean
    CategoryRepository repository;
    @MockBean
    CategoryMapper mapper;
    @Autowired
    CategoryServiceImpl service;
    @Before
    public void setUp() {
    }


    @Test
    @DisplayName("Test should pass when a list of categories is return")
    void getAllCategoriesSuccess() {
        CategoryForm form= Data.fillCategoryForm();
        Category category=Category.builder().id("1").name(form.getName()).build();
        CategoryDTO categoryDTO= CategoryDTO.builder().id("1").name(form.getName()).build();
        List<CategoryDTO> categoryDTOS=Data.listOfDTOCategories();
        List<Category> categories=Data.listOfCategories();
        categoryDTOS.forEach(System.out::println);
        Mockito.when(repository.findAll()).thenReturn(categories);
        Mockito.when(mapper.documentToDTO(categories.get(0))).thenReturn(categoryDTOS.get(0));

        Mockito.when(service.getAll()).thenReturn(categoryDTOS);

        /*Mockito.verify(repository.findAll());
        Mockito.verify(mapper.documentToDto(categories.get(0)));
        Mockito.verify(service.getAll());*/



        /*Mockito.when(repository.findByname(form.getName()).isEmpty()).thenReturn(false);
        Mockito.when(mapper.formToDocument(form)).thenReturn(category);
        Mockito.when(service.add(form)).thenReturn(categoryDTO);
        Mockito.when(repository.save(category)).thenReturn(category);
        Mockito.when(mapper.documentToDto(category)).thenReturn(categoryDTO);

        Mockito.verify(repository.findByname(form.getName()).isEmpty());
        Mockito.verify(mapper.formToDocument(form));
        Mockito.verify(service.add(form));
        Mockito.verify(repository.save(category));
        Mockito.verify(mapper.documentToDto(category));*/

    }
}