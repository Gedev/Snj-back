package com.snj.snjback.forms.updateForms;

import com.snj.snjback.entity.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DonationUpdateForm {
    private String title;
    private boolean hasCategory;
    private long quantity;
    private double amount;
    private boolean isCash;

    //    private Product[] products;
    //    private Project[] projects;
    private User donator;
}
