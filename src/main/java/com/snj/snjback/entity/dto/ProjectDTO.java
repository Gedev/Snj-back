package com.snj.snjback.entity.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProjectDTO {
    private long id;
    private String title;
}
