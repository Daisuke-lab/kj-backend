package com.kj.backend.Row;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/row")
public class RowController {

    private final RowService rowService;

    @Autowired
    public RowController(RowService rowService){
        this.rowService = rowService;
    }

    @GetMapping
    public List<Row> getRows() {
        return rowService.getRows();
    }

    @GetMapping(path="{id}")
    public Optional<Row> getRow(@PathVariable String id) {
        return rowService.getRow(id);
    }

    @PostMapping
    public Row createRow(@RequestBody Row row) {
        return rowService.createRow(row);
    }

    @PutMapping(path="{id}")
    public Row updateRow(@PathVariable String id, @RequestBody Row row) {
        return rowService.updateRow(id, row);
    }

    @DeleteMapping(path = "{id}")
    public void deleteRow(@PathVariable String id) {
        rowService.deleteRow(id);
    }
}
