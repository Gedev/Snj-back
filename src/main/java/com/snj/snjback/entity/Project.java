package com.snj.snjback.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String title;

//    @Column
//    private LocalDate creationDate;
//
//    @Column
//    private LocalDate ClosingDate;
//
//    @Column @NonNull
//    private String descrition;
//
//    @OneToOne
//    private Messaging messagingP;
//
//    @ManyToOne
//    private Category category;
//
//    @ManyToMany
//    private List<User> users;
//
//    @ManyToMany
//    private List<Avantage> avantagesP;
//
//    @ManyToMany
//    private List<Donation> donations;
}
