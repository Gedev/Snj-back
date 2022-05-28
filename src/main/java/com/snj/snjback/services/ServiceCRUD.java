package com.snj.snjback.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceCRUD<ID,FORM, FORMUPDATE,DTO>{

    DTO insert(FORM form) ;

    List<DTO> getAll();

    DTO update(ID id, FORMUPDATE form);

    DTO getOne(ID id);

    DTO delete(ID id);
}
