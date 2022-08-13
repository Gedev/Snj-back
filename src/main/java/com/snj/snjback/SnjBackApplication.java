package com.snj.snjback;


import com.snj.snjback.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.snj.snjback")
public class SnjBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(SnjBackApplication.class, args);
    }
}
