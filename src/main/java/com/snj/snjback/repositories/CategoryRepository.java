package com.snj.snjback.repositories;

import com.snj.snjback.documents.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
    Set<Category> findByname(String name);
}
