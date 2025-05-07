package com.basic.myspringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customers")
@Getter @Setter
public class Customer {
    //Primary Key, pk 값을 persistence provider 가 결정해라
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //유니크한 값을 가져야 하고, Null 값을 허용하지 않음
    @Column(unique = true, nullable = false)
    private String customerId;

    //Null 값을 허용하지 않음
    @Column(nullable = false)
    private String customerName;
}