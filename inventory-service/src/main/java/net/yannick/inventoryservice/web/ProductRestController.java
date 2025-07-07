package net.yannick.inventoryservice.web;

import net.yannick.inventoryservice.entity.Product;
import net.yannick.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ProductRestController {

    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @GetMapping("/products")
    public List<Product> ProductList(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product  productById(@PathVariable String id){
        return productRepository.findById(id).get();
    }

}
