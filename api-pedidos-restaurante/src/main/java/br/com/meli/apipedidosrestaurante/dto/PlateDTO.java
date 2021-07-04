package br.com.meli.apipedidosrestaurante.dto;

import java.math.BigDecimal;

public class PlateDTO {
    private int id;
    private BigDecimal price;
    private String description;
    private int quantity;

    public PlateDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
