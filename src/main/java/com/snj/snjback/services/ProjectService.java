package com.snj.snjback.services;

import com.snj.snjback.documents.dto.DonationDTO;
import com.snj.snjback.documents.dto.ProjectDTO;
import com.snj.snjback.forms.ProjectForm;
import com.snj.snjback.forms.projectForms.ProjectFormUpdate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements ServiceCRUD<String, ProjectForm, ProjectFormUpdate, ProjectDTO> {
    @Override
    public ProjectDTO insert(ProjectForm toAdd) {
        return null;
    }

    @Override
    public List<ProjectDTO> getAll() {
        return null;
    }

    @Override
    public ProjectDTO update(String id, ProjectFormUpdate form) {
        return null;
    }

    @Override
    public DonationDTO delete(String id) {
        return null;
    }

    @Override
    public ProjectDTO getOne(String id) {
        return null;
    }
}
