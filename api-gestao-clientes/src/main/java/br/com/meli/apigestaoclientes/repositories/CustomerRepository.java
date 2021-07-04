package br.com.meli.apigestaoclientes.repositories;

import br.com.meli.apigestaoclientes.dto.CustomerDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private List<CustomerDTO> customers = new ArrayList<>();
    private int id = 1;

    public CustomerDTO create(CustomerDTO customer) {
        // set customer id
        customer.setId(id);
        id++;

        // save customer
        customers.add(customer);

        return customer;
    }

    public CustomerDTO findById(int id) {
        for(CustomerDTO customer : customers) {
            if(customer.getId() == id) {
                return customer;
            }
        }

        return null;
    }
}
