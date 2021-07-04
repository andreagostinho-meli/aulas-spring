package br.com.meli.apigestaoclientes.services;

import br.com.meli.apigestaoclientes.dto.CustomerDTO;
import br.com.meli.apigestaoclientes.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDTO create(CustomerDTO customer) {
        return customerRepository.create(customer);
    }

    public CustomerDTO findById(int id) {
        return customerRepository.findById(id);
    }
}
