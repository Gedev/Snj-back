package com.snj.snjback.documents;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    private String id;
    @NonNull
    private String name;
    private ArrayList<Project> projects;

}
