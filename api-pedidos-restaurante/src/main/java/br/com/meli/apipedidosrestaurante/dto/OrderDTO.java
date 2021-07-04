package br.com.meli.apipedidosrestaurante.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderDTO {
    private int id;
    private int tableId;
    private List<PlateDTO> plates;
    private BigDecimal total;

    public OrderDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public List<PlateDTO> getPlates() {
        return plates;
    }

    public void setPlates(List<PlateDTO> plates) {
        this.plates = plates;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
