package com.snj.snjback.forms;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;


@Data
@Validated
public class CategorieForm {
    @NotBlank
    @Length(min = 2)
    private String name;
}
