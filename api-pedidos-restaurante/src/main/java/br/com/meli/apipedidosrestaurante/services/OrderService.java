package br.com.meli.apipedidosrestaurante.services;

import br.com.meli.apipedidosrestaurante.dto.OrderDTO;
import br.com.meli.apipedidosrestaurante.repositories.OrderRepository;
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
