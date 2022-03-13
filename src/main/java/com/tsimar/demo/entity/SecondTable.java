package com.tsimar.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SecondTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String stFirst;
    String stSecond;
    String stThird;
    int number;
    Long tableEntityId;


}
