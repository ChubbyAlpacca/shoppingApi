package org.example.shoppingapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ShoppingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                ShoppingApiApplication.class, args);
        log.info("Stripe key - ");
    }

}
