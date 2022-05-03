package com.snj.snjback.documents;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    private String id;
    @NonNull
    private String title;

    private LocalDate creationDate;

    private LocalDate ClosingDate;
    @NonNull
    private String descrition;

    @DBRef
    private Category category;
    @DBRef
    private Address address;
    private User[] users;
    private Avantage[] avantages;
}
