package com.demo.richmond.custorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.richmond.custorder.data.entity.CustomerEntity;
import com.demo.richmond.custorder.data.entity.OrderEntity;
import com.demo.richmond.custorder.data.repository.CustomerRepository;
import com.demo.richmond.custorder.service.dto.OrderDTO;

@Service
public class OrderService {

    @Autowired
    private CustomerRepository customerRepository;

    public void saveOrder(final OrderDTO order) {
        // find customer first
        final CustomerEntity customer = customerRepository.findById(order.getCustomerID()).orElse(null);
        if (customer == null) {
            throw new RuntimeException(String.format("Customer with ID %s does not exists", order.getCustomerID()));
        }

        final OrderEntity newOrder = mapToBean(order);
        newOrder.setCustomer(customer);

        customer.getOrders().add(newOrder);
        customerRepository.save(customer);
    }

    private OrderEntity mapToBean(final OrderDTO dto) {
        final OrderEntity bean = new OrderEntity();
        bean.setOrderDetail(dto.getOrderDetail());
        bean.setOrderDate(dto.getOrderDate());
        bean.setOrderAmount(dto.getOrderAmount());
        return bean;
    }

}
