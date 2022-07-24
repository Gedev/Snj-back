package com.snj.snjback.controllers;

import com.snj.snjback.entity.Project;
import com.snj.snjback.entity.User;
import com.snj.snjback.entity.dto.ProjectDTO;
import com.snj.snjback.forms.ProjectForm;
import com.snj.snjback.repositories.ProjectRepository;
import com.snj.snjback.services.ProjectServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    public final ProjectRepository repository;
    public final ProjectServiceImpl service;

    public ProjectController(ProjectRepository repository, ProjectServiceImpl service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping(path = {"", "/", "/all"})
    List<Project> getAll() {
        return repository.findAll();
    }

    @PostMapping(path = { "/add"})
    public ResponseEntity<ProjectDTO> insert(@Valid @RequestBody ProjectForm form) {
        System.out.println(form);
        return ResponseEntity.ok(service.insert(form));
    }


}
