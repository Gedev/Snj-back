package com.snj.snjback.controllers;

import com.snj.snjback.documents.Category;
import com.snj.snjback.documents.dto.CategorieDTO;
import com.snj.snjback.forms.CategorieForm;
import com.snj.snjback.repositories.CategorieRepository;
import com.snj.snjback.servies.CategorieService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategorieController {
    public final CategorieRepository repository;
    public final CategorieService service;
    public CategorieController(CategorieRepository repository, CategorieService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping(path = {"", "/", "/all"})
    public ResponseEntity<List<CategorieDTO>> getAll() {
        return ResponseEntity
                .ok(service.getAll());
    }
    @PostMapping(path = {"", "/", "/add"})
    public ResponseEntity<CategorieDTO>  insert(@Valid @RequestBody CategorieForm form){
        return ResponseEntity.ok(service.add(form));

    }
    @PatchMapping(path = {"/update"},params = {"id"})
    public ResponseEntity<CategorieDTO> update(@RequestParam Long id, @Valid @RequestBody CategorieForm form){
        return ResponseEntity.ok(service.update(id,form));

    }
}
