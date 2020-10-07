package com.demo.richmond.custorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.richmond.custorder.service.CustomerService;
import com.demo.richmond.custorder.service.dto.CustomerDTO;

@RestController
@RequestMapping(path = "/v1.0")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveCustomer(@RequestBody final CustomerDTO customer) {
        customerService.save(customer);
        return ResponseEntity.ok().build();
    }
}
