package br.com.meli.apipedidosrestaurante.repositories;

import br.com.meli.apipedidosrestaurante.dto.PlateDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlateRepository {
    private List<PlateDTO> plates = new ArrayList<>();
    private int id = 1;

    public PlateDTO create(PlateDTO plate) {
        plate.setId(id);
        id++;

        plates.add(plate);

        return plate;
    }
}
