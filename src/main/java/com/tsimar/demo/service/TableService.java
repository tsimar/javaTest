package com.tsimar.demo.service;

import com.tsimar.demo.entity.TableEntity;
import com.tsimar.demo.repos.TableRepos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {
final TableRepos tableRepos;

    public TableService(TableRepos tableRepos) {
        this.tableRepos = tableRepos;
    }

    public List<TableEntity> getAllByTable(){
        System.out.println(tableRepos.findAll());
        return tableRepos.findAll();
    }
}
