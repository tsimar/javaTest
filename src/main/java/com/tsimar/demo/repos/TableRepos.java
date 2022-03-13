package com.tsimar.demo.repos;

import com.tsimar.demo.entity.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepos extends JpaRepository <TableEntity, Long> {

}
