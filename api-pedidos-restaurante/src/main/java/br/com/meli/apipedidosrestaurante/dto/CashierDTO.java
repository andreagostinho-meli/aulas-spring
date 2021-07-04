package br.com.meli.apipedidosrestaurante.dto;

import java.math.BigDecimal;

public class CashierDTO {
    private BigDecimal balance = BigDecimal.ZERO;

    public CashierDTO() {}

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
