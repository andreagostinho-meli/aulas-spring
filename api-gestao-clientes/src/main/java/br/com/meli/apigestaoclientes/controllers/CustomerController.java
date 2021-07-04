package br.com.meli.apigestaoclientes.controllers;

import br.com.meli.apigestaoclientes.dto.CustomerDTO;
import br.com.meli.apigestaoclientes.dto.OrderDTO;
import br.com.meli.apigestaoclientes.dto.ProductDTO;
import br.com.meli.apigestaoclientes.services.CustomerService;
import br.com.meli.apigestaoclientes.services.OrderService;
import br.com.meli.apigestaoclientes.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomerService customerService;

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ProductDTO createProduct(@RequestBody ProductDTO product) {
        return productService.create(product);
    }

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public OrderDTO createOrder(@RequestBody OrderDTO order) {
        return orderService.create(order);
    }

    @PostMapping("/customer")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CustomerDTO createCustomer(@RequestBody CustomerDTO customer) {
        return customerService.create(customer);
    }

    @GetMapping("/customer/{id}")
    @ResponseBody
    public CustomerDTO getCustomer(@PathVariable int id) {
        CustomerDTO customer = customerService.findById(id);

        if(customer == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return customer;
    }
}
