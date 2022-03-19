package com.snj.snjback.services;

import com.snj.snjback.exeption.ElementNotFoundException;

import java.util.List;

public interface ServiceCRUD<ID,FORM,FORMUPDATE,DTO>{

    DTO add(FORM toAdd) ;
    List<DTO> getAll();
    DTO update(ID id, FORMUPDATE form);
    DTO delete(ID id)throws ElementNotFoundException;

}
