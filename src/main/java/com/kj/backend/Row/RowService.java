package com.kj.backend.Row;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;



@Service
public class RowService {

    private final RowRepository rowRepository;


    @Autowired
    public RowService(RowRepository rowRepository) {

        this.rowRepository = rowRepository;
    }

    public List<Row> getRows() {
        return rowRepository.findAll();
    }

    public Optional<Row> getRow(String id) {
        return rowRepository.findById(id);
    }

    public Row createRow(Row row) {
        return rowRepository.save(row);
    }

    public Row updateRow(String id, Row row) {
        row.setId(id);
        return rowRepository.save(row);
    }

    public void deleteRow(String id) {
        rowRepository.deleteById(id);
    }


}
