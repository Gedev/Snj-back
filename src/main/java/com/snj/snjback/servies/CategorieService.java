package com.snj.snjback.servies;

import com.snj.snjback.documents.Category;
import com.snj.snjback.exeption.ElementAlreadyExistsException;
import com.snj.snjback.forms.CategorieForm;
import com.snj.snjback.mappers.CategorieMapper;
import com.snj.snjback.documents.dto.CategorieDTO;
import com.snj.snjback.repositories.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategorieService {
    private final CategorieMapper mapper;
    private final CategorieRepository repository;

    public CategorieService(CategorieMapper mapper, CategorieRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public CategorieDTO add(CategorieForm toAdd) {
       if(!repository.findByname(toAdd.getName()).isEmpty())
           throw new ElementAlreadyExistsException(toAdd.getName());

        Category category= mapper.formToDocument(toAdd);
        category=repository.save(category);
        return mapper.documentToDto(category);
    }

    public List<CategorieDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::documentToDto)
                .collect(Collectors.toList());
    }
}
