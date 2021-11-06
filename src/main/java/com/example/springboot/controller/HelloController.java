/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springboot.controller;

/**
 *
 * @author jajimenez
 */
import com.example.springboot.entity.Customer;
import com.example.springboot.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/")
    public Iterable<Customer> index() {
        Iterable<Customer> customer = customerRepository.findAll();
        return customer;
    }

}
