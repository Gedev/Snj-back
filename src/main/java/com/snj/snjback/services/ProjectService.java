package com.snj.snjback.services;

import com.snj.snjback.documents.dto.DonationDTO;
import com.snj.snjback.documents.dto.ProjectDTO;
import com.snj.snjback.forms.ProjectForm;
import com.snj.snjback.forms.projectForms.ProjectFormUpdate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements ServiceCRUD<Long, ProjectForm, ProjectFormUpdate, ProjectDTO> {
    @Override
    public ProjectDTO insert(ProjectForm toAdd) {
        return null;
    }

    @Override
    public List<ProjectDTO> getAll() {
        return null;
    }

    @Override
    public ProjectDTO update(Long id, ProjectFormUpdate form) {
        return null;
    }

    @Override
    public ProjectDTO delete(Long id) {
        return null;
    }

    @Override
    public ProjectDTO getOne(Long id) {
        return null;
    }
}
