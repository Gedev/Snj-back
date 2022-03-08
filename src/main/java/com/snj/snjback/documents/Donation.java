package com.snj.snjback.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Donation {
    @Id
    private String id;
    private String title;
    private boolean hasCategory;
    private long quantity;
    private double amount;
    private boolean isCash;

    private Product[] products;
    private Project[] projects;
    private User donator;
}
