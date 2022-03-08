package com.snj.snjback.documents.dto;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@Builder
public class CategorieDTO {
    private ObjectId id;
    private String name;
}
