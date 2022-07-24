package com.snj.snjback.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String title;
    @Column
    private boolean hasCategory;
    @Column
    private long quantity;
    @Column
    private double amount;
    @Column
    private boolean isCash;

    @ManyToMany
    private List<Product> products;

//    @ManyToMany (mappedBy = "donations")
//    private List<Project> projects;

//    @ManyToOne
//    @JoinColumn (name = "user_id")
//    private User donator;
}
