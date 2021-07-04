package br.com.meli.apipedidosrestaurante.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TableDTO {
    private int id;
    private List<OrderDTO> orders = new ArrayList<>();
    private BigDecimal total = BigDecimal.ZERO;

    public TableDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
