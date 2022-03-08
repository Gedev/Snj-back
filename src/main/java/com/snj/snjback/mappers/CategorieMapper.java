package com.snj.snjback.mappers;

import com.snj.snjback.documents.Category;
import com.snj.snjback.forms.CategorieForm;
import com.snj.snjback.documents.dto.CategorieDTO;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class CategorieMapper implements BaseMapper<CategorieDTO, CategorieForm, Category>{
    @Override
    public CategorieDTO documentToDto(Category document){
        if(document==null)return null;
        return CategorieDTO.builder()
                .id(document.getId())
                .name(document.getName())
                .build();
    }

    @Override
    public Category formToDocument(CategorieForm form){
        Category c= new Category();
        c.setId(ObjectId.get());//Si on laisse document en long Long.parseLong(ObjectId.get().toString())
        c.setName(form.getName());
        return c;
    }
}
