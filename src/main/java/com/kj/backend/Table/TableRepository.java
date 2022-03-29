package com.kj.backend.Table;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface TableRepository extends MongoRepository<Table, String> {
}
