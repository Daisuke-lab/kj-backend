package com.kj.backend.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConnectionService {
    private final ConnectionRepository connectionRepository;


    @Autowired
    public ConnectionService(ConnectionRepository connectionRepository) {
        this.connectionRepository = connectionRepository;
    }

    public List<Connection> getConnections() {
        return connectionRepository.findAll();
    }

    public Optional<Connection> getConnection(String id) {
        return connectionRepository.findById(id);
    }

    public Connection createConnection(Connection connection) {
        return connectionRepository.save(connection);
    }

    public Connection updateConnection(String id, Connection connection) {
        connection.setId(id);
        connectionRepository.save(connection);
        return connection;
    }

    public void deleteConnection(String id) {
        connectionRepository.deleteById(id);
    }
}
