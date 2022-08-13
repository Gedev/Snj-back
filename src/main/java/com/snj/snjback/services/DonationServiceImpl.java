package com.snj.snjback.services;

import com.snj.snjback.documents.Donation;
import com.snj.snjback.documents.dto.DonationDTO;
import com.snj.snjback.exeption.ElementAlreadyExistsException;
import com.snj.snjback.exeption.ElementNotFoundException;
import com.snj.snjback.forms.DonationForm;
import com.snj.snjback.forms.updateForms.DonationUpdateForm;
import com.snj.snjback.mappers.DonationMapper;
import com.snj.snjback.repositories.DonationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DonationServiceImpl implements DonationService{
    private final DonationRepository repository;
    private final DonationMapper mapper;

    public DonationServiceImpl(DonationRepository repository, DonationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<DonationDTO> getAll() {
        return repository.findAll().stream()
                .map(mapper::documentToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DonationDTO getOne(Long id) {
        if (id == null)
            return null;

        if (!repository.existsById(id))
            throw new ElementNotFoundException();

        Donation found = repository.findById(id)
                .orElseThrow(ElementNotFoundException::new);

        return mapper.documentToDTO(found);
    }

    @Override
    public DonationDTO insert(DonationForm form) {
    if (form == null)
        return null;

    if (repository.existsById(form.getId()))
        throw new ElementAlreadyExistsException("");

    Donation toInsert = mapper.formToDocument(form);

    return mapper.documentToDTO(repository.save(toInsert));
    }

    @Override
    public DonationDTO delete(Long id) {
        if (id == null)
            return null;

        if (!repository.existsById(id))
            throw new ElementNotFoundException();

        Donation todelete = repository.findById(id)
                .orElseThrow(ElementNotFoundException::new);

        repository.delete(todelete);

        return mapper.documentToDTO(todelete);
    }

    @Override
    public DonationDTO update(Long id, DonationUpdateForm form) {
        if (form == null)
            return null;

        if (!repository.existsById(id))
            throw new ElementNotFoundException();

        Donation toUpdate = mapper.formUpdateToDocument(form);

        return mapper.documentToDTO(repository.save(toUpdate));
    }
}
