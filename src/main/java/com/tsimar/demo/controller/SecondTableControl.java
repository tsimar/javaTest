package com.tsimar.demo.controller;

import com.tsimar.demo.entity.SecondTable;
import com.tsimar.demo.service.SecondTableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("/second")
@CrossOrigin
public class SecondTableControl {
    final SecondTableService secondTableService;
    public SecondTableControl ( SecondTableService secondTableService){
        this.secondTableService=secondTableService;
    }
    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<List<SecondTable>> getAllById(@PathVariable Long id){
        return ResponseEntity.ok(secondTableService.getAllById(id));
    }
    @GetMapping
    public ResponseEntity<List<SecondTable>> getAll(){
        return ResponseEntity.ok(secondTableService.getAll());
    }
}
