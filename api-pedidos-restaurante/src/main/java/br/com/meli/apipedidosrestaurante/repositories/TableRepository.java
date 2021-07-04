package br.com.meli.apipedidosrestaurante.repositories;

import br.com.meli.apipedidosrestaurante.dto.OrderDTO;
import br.com.meli.apipedidosrestaurante.dto.TableDTO;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TableRepository {
    private List<TableDTO> tables = new ArrayList<>();
    private int id = 1;

    public TableDTO create(TableDTO table) {
        table.setId(id);
        id++;

        tables.add(table);

        return table;
    }

    public void addOrder(int id, OrderDTO order) {
        TableDTO table = findById(id);
        List<OrderDTO> orders = table.getOrders();
        orders.add(order);

        table.setOrders(orders);
        table.setTotal(table.getTotal().add(order.getTotal()));
    }

    public TableDTO findById(int id) {
        for(TableDTO table : tables) {
            if(table.getId() == id) return table;
        }

        return null;
    }

    public void close(TableDTO table) {
        table.setTotal(BigDecimal.ZERO);
        table.setOrders(new ArrayList<OrderDTO>());
    }
}
