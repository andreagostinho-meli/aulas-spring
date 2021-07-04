package br.com.meli.apigestaoclientes.services;

import br.com.meli.apigestaoclientes.dto.ProductDTO;
import br.com.meli.apigestaoclientes.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductDTO create(ProductDTO product) {
        return productRepository.create(product);
    }
}
