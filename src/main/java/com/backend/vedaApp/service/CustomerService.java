package com.backend.vedaApp.service;

import com.backend.vedaApp.model.Customer;
import com.backend.vedaApp.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer getCustomerById(int id) {
        return customerRepo.findById(id).get();
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }


}
