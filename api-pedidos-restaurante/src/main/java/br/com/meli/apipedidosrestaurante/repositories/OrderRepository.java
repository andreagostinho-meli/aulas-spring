package br.com.meli.apipedidosrestaurante.repositories;

import br.com.meli.apipedidosrestaurante.dto.OrderDTO;
import br.com.meli.apipedidosrestaurante.dto.PlateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private List<OrderDTO> orders = new ArrayList<>();
    private int id = 1;

    public OrderDTO create(OrderDTO order) {
        order.setId(id);
        id++;

        BigDecimal orderTotal = BigDecimal.ZERO;

        for(PlateDTO plate : order.getPlates()) {
            orderTotal = orderTotal.add(plate.getPrice().multiply(new BigDecimal(plate.getQuantity())));
        }

        order.setTotal(orderTotal);

        orders.add(order);

        return order;
    }
}
