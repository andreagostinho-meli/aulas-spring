package br.com.meli.apicrudprodutos.models;

import br.com.meli.apicrudprodutos.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {
    private int code = 1;
    private List<Product> productsList = new ArrayList<Product>();

    public Product create(Product product) {
        product.setCode(code);
        code++;
        productsList.add(product);
        return product;
    }

    public List<Product> list() {
        return productsList;
    }

    public Product update(int code, Product newProduct) {
        Product updatedProduct = null;

        for(Product product : productsList) {
            if(product.getCode() == code) {
                product.setName(newProduct.getName());
                product.setPrice(newProduct.getPrice());
                product.setStock(newProduct.getStock());
                updatedProduct = product;
                break;
            }
        }

        return updatedProduct;
    }

    public void delete(int code) {
        for(Product product : productsList) {
            if(product.getCode() == code) {
                productsList.remove(product);
                break;
            }
        }
    }
}
