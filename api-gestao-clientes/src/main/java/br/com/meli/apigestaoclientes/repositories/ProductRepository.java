package br.com.meli.apigestaoclientes.repositories;

import br.com.meli.apigestaoclientes.dto.ProductDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<ProductDTO> products = new ArrayList<>();
    private int id = 1;

    public ProductDTO create(ProductDTO product) {
        // set product id
        product.setId(id);
        id++;

        // save product
        products.add(product);

        return product;
    }
}
