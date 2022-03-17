package com.snj.snjback.forms.updateForms;

import com.snj.snjback.documents.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class DonationUpdateForm {
    @NotBlank
    private String title;
    @NotNull
    private boolean hasCategory;
    @NotNull
    private long quantity;
    @NotNull
    private double amount;
    @NotNull
    private boolean isCash;

    //    private Product[] products;
    //    private Project[] projects;
    private User donator;
}
