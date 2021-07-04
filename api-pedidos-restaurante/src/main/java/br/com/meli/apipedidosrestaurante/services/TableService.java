package br.com.meli.apipedidosrestaurante.services;

import br.com.meli.apipedidosrestaurante.dto.OrderDTO;
import br.com.meli.apipedidosrestaurante.dto.TableDTO;
import br.com.meli.apipedidosrestaurante.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TableService {
    @Autowired
    private TableRepository tableRepository;

    public TableDTO create(TableDTO table) {
        return tableRepository.create(table);
    }

    public TableDTO findById(int id) {
        return tableRepository.findById(id);
    }

    public void addOrder(int id, OrderDTO order) {
        tableRepository.addOrder(id, order);
    }

    public void close(TableDTO table) {
        tableRepository.close(table);
    }
}
