package com.demo.richmond.custorder.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.richmond.custorder.data.entity.CustomerEntity;
import com.demo.richmond.custorder.data.entity.OrderEntity;
import com.demo.richmond.custorder.data.repository.CustomerRepository;
import com.demo.richmond.custorder.service.dto.CustomerDataDTO;
import com.demo.richmond.custorder.service.dto.OrderDataDTO;

@Service
public class DataService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerDataDTO> getData() {
        final List<CustomerDataDTO> customers = new ArrayList<>();
        customerRepository.findAll().forEach(b -> {
            customers.add(mapToBean(b));
        });
        return customers.stream().sorted(Comparator.comparing(CustomerDataDTO::getCustomerName))
                .collect(Collectors.toList());
    }

    private CustomerDataDTO mapToBean(final CustomerEntity customer) {
        final CustomerDataDTO bean = new CustomerDataDTO();
        bean.setCustomerID(customer.getCustomerID());
        bean.setCustomerAge(customer.getCustomerAge());
        bean.setCustomerName(customer.getCustomerName());
        bean.setCustomerAddress(customer.getCustomerAddress());
        for (OrderEntity order : customer.getOrders()) {
            bean.getOrders().add(mapToBean(order));
        }
        return bean;
    }

    private OrderDataDTO mapToBean(final OrderEntity order) {
        final OrderDataDTO bean = new OrderDataDTO();
        bean.setOrderID(order.getOrderID());
        bean.setOrderDetail(order.getOrderDetail());
        bean.setOrderAmount(order.getOrderAmount());
        bean.setOrderDate(order.getOrderDate());
        return bean;
    }

    public int numberOfWords(final String a) {
        Scanner scanner = new Scanner(a);
        scanner.useDelimiter(" ");
        Set<String> words = new HashSet<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        scanner.close();
        return words.size();
    }
}
