package com.snj.snjback.services;

import com.snj.snjback.documents.Donation;
import com.snj.snjback.dtos.DonationDTO;
import com.snj.snjback.exceptions.ElementAlreadyExistException;
import com.snj.snjback.exeption.ElementNotFoundException;
import com.snj.snjback.forms.DonationForm;
import com.snj.snjback.forms.updateForms.DonationUpdateForm;
import com.snj.snjback.mappers.DonationMapper;
import com.snj.snjback.repositories.DonationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService{
    private final DonationRepository repository;
    private final DonationMapper mapper;

    public DonationServiceImpl(DonationRepository repository, DonationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public DonationDTO add(DonationForm form) {
        if (form == null)
            return null;

        if (repository.existsById(form.getId()))
            throw new ElementAlreadyExistException();

        Donation toInsert = mapper.formToDocument(form);

        return mapper.documentToDTO(repository.insert(toInsert));
    }

    @Override
    public List<DonationDTO> getAll() {
        return null;
    }

    @Override
    public DonationDTO update(Long aLong, DonationUpdateForm form) {
        return null;
    }

    @Override
    public DonationDTO delete(Long aLong) throws ElementNotFoundException {
        return null;
    }


}
