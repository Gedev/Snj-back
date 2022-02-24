package com.snj.snjback.documents;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    private ObjectId id;
    @NonNull
    private String title;

    private LocalDate creationDate;

    private LocalDate ClosingDate;
    @NonNull
    private String descrition;
    private Messaging messagingP;
    private Categorie categorie;
    //one address
}
