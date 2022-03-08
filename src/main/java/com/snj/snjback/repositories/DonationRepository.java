package com.snj.snjback.repositories;

import com.snj.snjback.documents.Donation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DonationRepository extends MongoRepository<Donation, String> {
}
