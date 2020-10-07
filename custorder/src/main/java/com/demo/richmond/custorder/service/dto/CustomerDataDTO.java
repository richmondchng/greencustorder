package com.demo.richmond.custorder.service.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerDataDTO {

    private int customerID;
    private String customerName;
    private int customerAge;
    private String customerAddress;
    private List<OrderDataDTO> orders = new ArrayList<>();
}
