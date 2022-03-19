package com.snj.snjback.mappers;

import com.snj.snjback.documents.Category;
import com.snj.snjback.forms.CategoryForm;
import com.snj.snjback.documents.dto.CategoryDTO;
import com.snj.snjback.forms.updateForms.CategoryFormUpdate;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapper implements Mapper<Category,CategoryDTO,CategoryForm,CategoryFormUpdate>{
    @Override
    public CategoryDTO documentToDTO(Category category) {
        if(category==null)return null;
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
    @Override
    public Category formToDocument(CategoryForm categoryForm) {
        Category c= new Category();
        c.setId(String.valueOf(ObjectId.get()));//Si on laisse document en long Long.parseLong(ObjectId.get().toString())
        c.setName(categoryForm.getName());
        return c;
    }

    @Override
    public Category formUpdateToDocument(CategoryFormUpdate form) {
        Category c= new Category();
        c.setName(form.getName());
        return c;
    }
}
