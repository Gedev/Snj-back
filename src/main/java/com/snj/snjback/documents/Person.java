package com.snj.snjback.documents;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    private ObjectId id;
    @NonNull
    private String surname;
    @NonNull
    private String name;
}
