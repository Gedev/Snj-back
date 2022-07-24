package com.snj.snjback.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private LocalDate birthdate;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

//    @ManyToMany (mappedBy = "users", fetch = FetchType.LAZY)
//    private List<Project> projects;
//
//    @OneToMany(mappedBy = "donator")
//    private List<Donation> donation;
}
