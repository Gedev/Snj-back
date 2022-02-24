package com.snj.snjback.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private ObjectId id;

    private String firstname;
    private String lastname;
    private LocalDate birthdate;
}
