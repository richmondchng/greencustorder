package com.demo.richmond.custorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.richmond.custorder.service.DataService;
import com.demo.richmond.custorder.service.dto.CustomerDataDTO;

@RestController
@RequestMapping(path = "/v1.0")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping(path = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDataDTO> getData() {
        return dataService.getData();
    }
}
