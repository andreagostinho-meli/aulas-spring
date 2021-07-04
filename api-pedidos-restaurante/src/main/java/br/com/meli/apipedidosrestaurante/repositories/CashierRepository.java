package br.com.meli.apipedidosrestaurante.repositories;

import br.com.meli.apipedidosrestaurante.dto.CashierDTO;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class CashierRepository {
    private CashierDTO cashier = new CashierDTO();

    public void addCash(BigDecimal value) {
        cashier.setBalance(cashier.getBalance().add(value));
    }

    public CashierDTO getBalance() {
        return cashier;
    }
}
