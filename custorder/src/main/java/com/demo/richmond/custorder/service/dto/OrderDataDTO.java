package com.demo.richmond.custorder.service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderDataDTO {

    private int orderID;
    private String orderDetail;
    private LocalDateTime orderDate;
    private BigDecimal orderAmount;
}
