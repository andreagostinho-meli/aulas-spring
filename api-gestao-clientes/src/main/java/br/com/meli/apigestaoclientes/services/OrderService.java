package br.com.meli.apigestaoclientes.services;

import br.com.meli.apigestaoclientes.dto.OrderDTO;
import br.com.meli.apigestaoclientes.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderDTO create(OrderDTO order) {
        return orderRepository.create(order);
    }
}
