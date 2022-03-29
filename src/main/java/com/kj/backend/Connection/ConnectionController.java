package com.kj.backend.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/connection")
public class ConnectionController {

    private final ConnectionService connectionService;

    @Autowired
    public ConnectionController(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @GetMapping
    public List<Connection> getConnections() {
        return connectionService.getConnections();
    }
    
    @PostMapping
    public Connection createConnection(@RequestBody Connection connection) {
        return connectionService.createConnection(connection);
    }

    @PutMapping(path = "{id}")
    public Connection updateConnection(
            @PathVariable("id") String id,
            @RequestBody Connection connection
    ) {
        return connectionService.updateConnection(id, connection);
    }

    @DeleteMapping(path = "{id}")
    public void deleteConnection(
            @PathVariable String id
    ) {
        connectionService.deleteConnection(id);
    }


}
