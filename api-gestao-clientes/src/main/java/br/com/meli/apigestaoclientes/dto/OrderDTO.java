package br.com.meli.apigestaoclientes.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderDTO {
    private int id;
    private List<ProductDTO> products;
    private BigDecimal total;

    public OrderDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
