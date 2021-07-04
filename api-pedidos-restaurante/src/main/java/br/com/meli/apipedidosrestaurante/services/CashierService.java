package br.com.meli.apipedidosrestaurante.services;

import br.com.meli.apipedidosrestaurante.dto.CashierDTO;
import br.com.meli.apipedidosrestaurante.repositories.CashierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CashierService {
    @Autowired
    private CashierRepository cashierRepository;

    public void addCash(BigDecimal value) {
        cashierRepository.addCash(value);
    }

    public CashierDTO getBalance() {
        return cashierRepository.getBalance();
    }
}
