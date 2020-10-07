package com.demo.richmond.custorder.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerDTO {

    private int customerID;
    private String customerName;
    private int customerAge;
    private String customerAddress;

}
