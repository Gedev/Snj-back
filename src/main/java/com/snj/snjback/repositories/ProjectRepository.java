package com.snj.snjback.repositories;

import com.snj.snjback.documents.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
