package com.snj.snjback;

import com.snj.snjback.documents.User;
import com.snj.snjback.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnjBackApplication {

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SnjBackApplication.class, args);
    }
}
