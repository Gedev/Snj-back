package com.snj.snjback.repositories;

import com.snj.snjback.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
