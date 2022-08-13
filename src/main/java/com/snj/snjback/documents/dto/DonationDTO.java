package com.snj.snjback.documents.dto;

import com.snj.snjback.documents.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DonationDTO {
    private long id;
    private String title;
    private boolean hasCategory;
    private long quantity;
    private double amount;
    private boolean isCash;

//    private Product[] products;
//    private Project[] projects;
    private User donator;
}
