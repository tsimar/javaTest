package com.tsimar.demo.service;

import com.tsimar.demo.entity.SecondTable;
import com.tsimar.demo.repos.SecondTableRepos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondTableService {
    final SecondTableRepos secondTableRepos;

    public SecondTableService(SecondTableRepos secondTableRepos) {
        this.secondTableRepos = secondTableRepos;
    }

    public List<SecondTable> getAllById(Long id) {
        return secondTableRepos.findAllByIdTable(id);
    }

    public List<SecondTable> getAll() {
        return secondTableRepos.findAll();
    }
}
