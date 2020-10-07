package com.demo.richmond.custorder.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "rc_customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerID")
    private int customerID;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerAge")
    private int customerAge;

    @Column(name = "customerAddress")
    private String customerAddress;
}
