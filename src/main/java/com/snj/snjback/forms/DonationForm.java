package com.snj.snjback.forms;

import com.snj.snjback.documents.Product;
import com.snj.snjback.documents.Project;
import com.snj.snjback.documents.User;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@Validated
public class DonationForm {
    private String id;
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
