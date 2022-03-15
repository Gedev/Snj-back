package com.snj.snjback.services;

import java.util.List;

public interface ServiceCRUD<ID,FORM,DTO>{

    public DTO add(FORM toAdd) ;

    public List<DTO> getAll();

    public DTO update(ID id, FORM form);
}
