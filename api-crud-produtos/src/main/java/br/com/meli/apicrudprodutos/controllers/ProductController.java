package br.com.meli.apicrudprodutos.controllers;

import br.com.meli.apicrudprodutos.entities.Product;
import br.com.meli.apicrudprodutos.models.ProductModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private ProductModel productModel = new ProductModel();

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Product create(@RequestBody Product product) {
        return productModel.create(product);
    }

    @GetMapping("/products")
    @ResponseBody
    public List<Product> list() {
        return productModel.list();
    }

    @PutMapping("/products/{code}")
    @ResponseBody
    public Product update(@PathVariable int code, @RequestBody Product product) {
        return productModel.update(code, product);
    }

    @DeleteMapping("/products/{code}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int code) {
        productModel.delete(code);
    }
}
