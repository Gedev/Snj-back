package com.snj.snjback.services;

import com.snj.snjback.entity.Project;
import com.snj.snjback.entity.dto.ProjectDTO;
import com.snj.snjback.forms.ProjectForm;
import com.snj.snjback.forms.projectForms.ProjectFormUpdate;
import com.snj.snjback.mappers.ProjectMapper;
import com.snj.snjback.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectMapper mapper;
    private final ProjectRepository repository;

    public ProjectServiceImpl(ProjectMapper mapper, ProjectRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public ProjectDTO insert(ProjectForm toAdd) {
        Project project = mapper.formToEntity(toAdd);
        project = repository.save(project);
        return mapper.entityToDto(project);
    }

    @Override
    public List<ProjectDTO> getAll() {
        return null;
    }

    @Override
    public ProjectDTO update(Long aLong, ProjectFormUpdate form) {
        return null;
    }

    @Override
    public ProjectDTO getOne(Long aLong) {
        return null;
    }

    @Override
    public ProjectDTO delete(Long aLong) {
        return null;
    }
}
