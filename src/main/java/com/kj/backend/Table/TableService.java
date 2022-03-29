package com.kj.backend.Table;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TableService {
    private TableRepository tableRepository;

    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<Table> getTables() {
        return tableRepository.findAll();
    }

    public Optional<Table> getTable(String id) {
        return tableRepository.findById(id);
    }

    public Table createTable(Table table) {
        return tableRepository.save(table);
    }

    public Table updateTable(String id, Table table) {
        table.setId(id);
        return tableRepository.save(table);
    }

    public void deleteTable(String id) {
        tableRepository.deleteById(id);
    }
}
