package com.tsimar.demo.controller;

import com.tsimar.demo.entity.TableEntity;
import com.tsimar.demo.service.TableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/table")
@CrossOrigin
public class TableControl {
    final TableService tableService;
    public TableControl(TableService tableService){
        this.tableService=tableService;
    }
    @GetMapping
   public ResponseEntity<List<TableEntity>> getAll(){
        return ResponseEntity.ok(tableService.getAllByTable());
    }

}
