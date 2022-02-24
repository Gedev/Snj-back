package com.snj.snjback.documents;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "address")
public class Address {
    private String street;
    private String town;
    private String country;
    private String postCode;
}
