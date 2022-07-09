package com.lwh.shoppingwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ShoppingwebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingwebsiteApplication.class, args);
    }

}
