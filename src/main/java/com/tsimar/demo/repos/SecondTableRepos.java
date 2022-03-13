package com.tsimar.demo.repos;

import com.tsimar.demo.entity.SecondTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondTableRepos extends JpaRepository<SecondTable,Long> {
    @Query(value = "SELECT s FROM SecondTable s WHERE s.tableEntityId=:id")
    List<SecondTable> findAllByIdTable(@Param("id") Long id);
}
