package com.snj.snjback.forms;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class ProjectForm {
    @Length(min = 2)
    private String title;
}
