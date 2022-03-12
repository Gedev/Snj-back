package com.snj.snjback.repositories;

import com.snj.snjback.documents.Category;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Set;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Set<Category> findByname(String name);
}
