package com.snj.snjback.servies;

import com.snj.snjback.documents.Category;
import com.snj.snjback.documents.dto.CategorieDTO;
import com.snj.snjback.exeption.ElementAlreadyExistsException;
import com.snj.snjback.forms.CategorieForm;

import java.util.List;
import java.util.stream.Collectors;

public interface GeneralService <ID,FORM,DTO>{

    public DTO add(FORM toAdd) ;

    public List<DTO> getAll();

    public DTO update(ID id, FORM form);
}
