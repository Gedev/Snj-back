package com.snj.snjback.controllers;

import com.snj.snjback.documents.User;
import com.snj.snjback.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository repository;


    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = {"", "/", "/all"})
    List<User> getAll() {
        return repository.findAll();
    }
}
