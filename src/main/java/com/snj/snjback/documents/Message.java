package com.snj.snjback.documents;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    private ObjectId id;
    @NonNull
    private String content;
    @CreatedDate
    private LocalDate date;
    private Messaging messaging;

}
