package com.snj.snjback.documents;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;

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
    private Category category;
    private Address addressP;
    private ArrayList<User>collaborators;
    private ArrayList<User>parters;
    private ArrayList<Avantage>avantagesP;
    //liste de don
}
