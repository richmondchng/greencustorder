package com.demo.richmond.custorder.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.richmond.custorder.data.entity.CustomerEntity;

/**
 * Customer repository.
 * 
 * @author richmondchng
 *
 */
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {

}
