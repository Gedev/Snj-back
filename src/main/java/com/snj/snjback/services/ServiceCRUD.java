package com.snj.snjback.services;

import com.snj.snjback.documents.dto.DonationDTO;

import java.util.List;

public interface ServiceCRUD<ID,FORM, FORMUPDATE,DTO>{

    public DTO insert(FORM form) ;

    public List<DTO> getAll();

    public DTO update(ID id, FORMUPDATE form);

    public DTO getOne(ID id);

    public DonationDTO delete(ID id);
}
