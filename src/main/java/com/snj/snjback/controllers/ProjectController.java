package com.snj.snjback.controllers;

import com.snj.snjback.documents.dto.ProjectDTO;
import com.snj.snjback.repositories.ProjectRepository;
import com.snj.snjback.services.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    public final ProjectRepository repository;
    public final ProjectService service;

    public ProjectController(ProjectRepository repository, ProjectService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping(path = {"", "/", "/all"})
    public ResponseEntity<List<ProjectDTO>> getAll() {
        return ResponseEntity
                .ok(service.getAll());
    }
}
