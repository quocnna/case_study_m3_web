package cg.m3.furama.service;

import cg.m3.furama.model.Customer;
import cg.m3.furama.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
       return customerRepository.findAll();
    }

    @Override
    public void save() {

    }

    @Override
    public List<Customer> find(String q) {
        return null;
    }
}
