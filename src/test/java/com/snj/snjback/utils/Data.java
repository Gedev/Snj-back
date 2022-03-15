package com.snj.snjback.utils;

import com.snj.snjback.documents.Category;
import com.snj.snjback.documents.dto.CategoryDTO;
import com.snj.snjback.forms.CategoryForm;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static CategoryForm fillCategoryForm(){
        CategoryForm category=new CategoryForm();
        category.setName("FalseCategory");
        return category;
    }
    public static List<CategoryDTO> listOfDTOCategories(){
        List<CategoryDTO> categoryDTOS=new ArrayList<>();
        categoryDTOS.add(CategoryDTO.builder()
                .id("1000")
                .name("categorie 1")
                .build());
        categoryDTOS.add(CategoryDTO.builder()
                .id("1001")
                .name("categorie 2")
                .build());
        categoryDTOS.add(CategoryDTO.builder()
                .id("1002")
                .name("categorie 3")
                .build());

        return categoryDTOS;
    }
    public static List<Category> listOfCategories(){
        List<Category> categories=new ArrayList<>();
        categories.add(Category.builder()
                .id("1000")
                .name("categorie 1")
                .build());
        categories.add(Category.builder()
                .id("1001")
                .name("categorie 2")
                .build());
        categories.add(Category.builder()
                .id("1002")
                .name("categorie 3")
                .build());

        return categories;
    }
}
