package com.demo.richmond.custorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.richmond.custorder.data.entity.CustomerEntity;
import com.demo.richmond.custorder.data.repository.CustomerRepository;
import com.demo.richmond.custorder.service.dto.CustomerDTO;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void save(final CustomerDTO customer) {
        customerRepository.save(mapToBean(customer));
    }

    private CustomerEntity mapToBean(final CustomerDTO dto) {
        final CustomerEntity entity = new CustomerEntity();
        entity.setCustomerName(dto.getCustomerName());
        entity.setCustomerAge(dto.getCustomerAge());
        entity.setCustomerAddress(dto.getCustomerAddress());
        return entity;
    }
}
