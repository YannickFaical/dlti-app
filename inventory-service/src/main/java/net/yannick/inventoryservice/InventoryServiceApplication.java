package net.yannick.inventoryservice;

import net.yannick.inventoryservice.entity.Product;
import net.yannick.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (ProductRepository productRepository){

        return args -> {
            productRepository.save(Product.builder().name("Computer")
                            .id(UUID.randomUUID().toString())
                    .price(2300)
                    .quantity(12)
                    .build());
            productRepository.save(Product.builder().name("Printer")
                    .id(UUID.randomUUID().toString())
                    .price(5300)
                    .quantity(9)
                    .build());
            productRepository.save(Product.builder().name("Smart phone")
                    .id(UUID.randomUUID().toString())
                    .price(1500)
                    .quantity(23)
                    .build());

        };
    }
}
