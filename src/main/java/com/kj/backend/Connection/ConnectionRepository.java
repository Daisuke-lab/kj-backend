package com.kj.backend.Connection;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface ConnectionRepository extends MongoRepository<Connection, String>{
    public Connection findBySourceId(String sourceId);
    public List<Connection> findByDestinationId(String destinationId);
}
