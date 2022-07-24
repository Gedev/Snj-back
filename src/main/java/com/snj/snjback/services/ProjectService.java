package com.snj.snjback.services;


import com.snj.snjback.entity.Category;
import com.snj.snjback.entity.dto.ProjectDTO;
import com.snj.snjback.forms.ProjectForm;
import com.snj.snjback.forms.projectForms.ProjectFormUpdate;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface ProjectService extends ServiceCRUD<Long, ProjectForm, ProjectFormUpdate, ProjectDTO> {
}
