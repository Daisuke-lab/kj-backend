package com.kj.backend.Table;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/table")
public class TableController {

    private final TableService tableService;

    @Autowired
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping
    public List<Table> getTables() {
        return tableService.getTables();
    }

    @GetMapping(path="{id}")
    public Optional<Table> getTable(@PathVariable String id) { return tableService.getTable(id);}

    @PostMapping
    public Table createTable(@RequestBody Table table) {
        return tableService.createTable(table);
    }

    @PutMapping(path="{id}")
    public Table updateTable(@PathVariable String id, @RequestBody Table table) {
        return tableService.updateTable(id, table);
    }

    @DeleteMapping(path="{id}")
    public void deleteTable(@PathVariable String id) {
        tableService.deleteTable(id);
    }



}
