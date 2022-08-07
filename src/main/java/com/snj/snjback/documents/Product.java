package com.snj.snjback.documents;

import lombok.*;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@Min(1)
    @Column
    private int quantity;

    @Column
    private LocalDate expirationDate;

    @ManyToMany (mappedBy = "products")
    private List<Beneficiary> beneficiaryList;

    @ManyToMany (mappedBy = "products")
    private List<Donation> donationList;

    @ManyToOne
    private Type type;

    @ManyToMany (mappedBy = "productList")
    private List<Avantage> avantages;

}
