package com.snj.snjback.mappers;

import com.snj.snjback.documents.Category;
import com.snj.snjback.forms.CategoryForm;
import com.snj.snjback.documents.dto.CategoryDTO;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapper implements BaseMapper<CategoryDTO, CategoryForm, Category>{
    @Override
    public CategoryDTO documentToDto(Category document){
        if(document==null)return null;
        return CategoryDTO.builder()
                .id(document.getId())
                .name(document.getName())
                .build();
    }

    @Override
    public Category formToDocument(CategoryForm form){
        Category c= new Category();
        c.setId(c.getId());
        c.setName(form.getName());
        return c;
    }
}
