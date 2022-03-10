package com.snj.snjback.documents.dto;

import com.snj.snjback.documents.Product;
import com.snj.snjback.documents.Project;
import com.snj.snjback.documents.User;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@Builder
public class DonationDTO {
    private String id;
    private String title;
    private boolean hasCategory;
    private long quantity;
    private double amount;
    private boolean isCash;

//    private Product[] products;
//    private Project[] projects;
    private User donator;
}
