package com.snj.snjback.mappers;

import com.snj.snjback.entity.Project;
import com.snj.snjback.entity.dto.ProjectDTO;
import com.snj.snjback.forms.ProjectForm;
import org.springframework.stereotype.Service;

@Service
public class ProjectMapper implements BaseMapper<ProjectDTO, ProjectForm, Project>{
    @Override
    public ProjectDTO entityToDto(Project entity) {
        return ProjectDTO.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .build();
    }

    @Override
    public Project formToEntity(ProjectForm form) {
        Project p = new Project();
        p.setId(p.getId());
        p.setTitle(form.getTitle());
        return p;
    }
}
