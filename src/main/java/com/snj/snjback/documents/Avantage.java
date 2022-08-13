package com.snj.snjback.documents;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Avantage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NonNull
    private String title;
    @NonNull
    private String description;

    @ManyToMany (mappedBy = "avantagesP")
    private List<Project> projects;

    @ManyToMany
    private List<Product> productList;
}
