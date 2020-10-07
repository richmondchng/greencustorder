package com.demo.richmond.custorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.richmond.custorder.service.OrderService;
import com.demo.richmond.custorder.service.dto.OrderDTO;

@RestController
@RequestMapping(path = "/api/v1.0")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(path = "/order", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveOrder(@RequestBody final OrderDTO order) {
        orderService.saveOrder(order);
        return ResponseEntity.ok().build();
    }
}
