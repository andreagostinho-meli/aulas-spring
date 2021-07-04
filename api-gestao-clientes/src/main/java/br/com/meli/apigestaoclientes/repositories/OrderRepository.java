package br.com.meli.apigestaoclientes.repositories;

import br.com.meli.apigestaoclientes.dto.OrderDTO;
import br.com.meli.apigestaoclientes.dto.ProductDTO;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private List<OrderDTO> orders = new ArrayList<>();
    private int id = 1;

    public OrderDTO create(OrderDTO order) {
        // set order id
        order.setId(id);
        id++;

        // set order total
        BigDecimal orderTotal = BigDecimal.ZERO;

        for (ProductDTO product : order.getProducts()) {
            BigDecimal productPrice = product.getPrice();
            int productQuantity = product.getQuantity();

            orderTotal = orderTotal.add(productPrice.multiply(new BigDecimal(productQuantity)));
        }

        order.setTotal(orderTotal);

        // save order
        orders.add(order);

        return order;
    }
}
