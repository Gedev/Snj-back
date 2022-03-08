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
public class Avantage {
    @Id
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String description;

    //private Project[] projectsA;
    //liste produits ??
}
