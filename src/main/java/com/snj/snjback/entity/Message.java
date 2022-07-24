package com.snj.snjback.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;


import javax.persistence.*;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    @NonNull
    private String content;

    @Column
    @CreatedDate
    private LocalDate date;

    @ManyToOne
    private Messaging messaging;

}
