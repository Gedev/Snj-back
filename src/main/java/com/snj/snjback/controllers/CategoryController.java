package com.snj.snjback.controllers;

import com.snj.snjback.documents.dto.CategoryDTO;
import com.snj.snjback.forms.CategoryForm;
import com.snj.snjback.forms.updateForms.CategoryFormUpdate;
import com.snj.snjback.repositories.CategoryRepository;
import com.snj.snjback.services.CategoryServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    public final CategoryRepository repository;
    public final CategoryServiceImpl service;

    public CategoryController(CategoryRepository repository, CategoryServiceImpl service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping(path = {"", "/", "/all"})
    public ResponseEntity<List<CategoryDTO>> getAll() {
        return ResponseEntity
                .ok(service.getAll());
    }

    @PostMapping(path = {"", "/", "/add"})
    public ResponseEntity<CategoryDTO>  insert(@Valid @RequestBody CategoryForm form){
        return ResponseEntity.ok(service.insert(form));

    }
    @PatchMapping(path = {"/update"},params = {"id"})
    public ResponseEntity<CategoryDTO> update(@RequestParam String id, @Valid @RequestBody CategoryFormUpdate form){
        return ResponseEntity.ok(service.update(id,form));

    }
    @DeleteMapping(path = {"/delete"},params = {"id"})
    public ResponseEntity<CategoryDTO> delete(@RequestParam String id){
        return ResponseEntity.ok(service.delete(id));
    }
}
