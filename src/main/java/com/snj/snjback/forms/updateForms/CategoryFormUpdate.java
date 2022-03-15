package com.snj.snjback.forms.updateForms;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@Validated
public class CategoryFormUpdate {
    @NotBlank
    @Length(min = 2)
    private String name;
}
