package com.codegym.demo.service;

import com.codegym.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    List<Customer> findAll();

    Page<Customer> findAll(Pageable pageInfo);

    List<Customer> search(String keyword);

    Page<Customer> search(String keyword, Pageable pageInfo);

    Optional<Customer> findOne(Long id);

    Customer save(Customer customer);


    boolean exists(Long id);

    List<Customer> findAll(List<Long> ids);

    long count();

    void delete(Long id);

    void delete(List<Customer> customers);

    void deleteAll();
}
