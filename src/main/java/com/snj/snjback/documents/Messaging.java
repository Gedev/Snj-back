package com.snj.snjback.documents;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Messaging {
    @Id
    private ObjectId id;
    @NonNull
    private String title;

    private boolean isOpen;
    @DBRef
    private Project projectM;
   // private Message[] messages;

}
