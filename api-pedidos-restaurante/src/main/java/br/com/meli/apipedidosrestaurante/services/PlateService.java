package br.com.meli.apipedidosrestaurante.services;

import br.com.meli.apipedidosrestaurante.dto.PlateDTO;
import br.com.meli.apipedidosrestaurante.repositories.PlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlateService {
    @Autowired
    private PlateRepository plateRepository;

    public PlateDTO create(PlateDTO plate) {
        return plateRepository.create(plate);
    }
}
