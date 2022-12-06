package com.hyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hyn","org.example"})
public class ProdectServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProdectServiceApplication.class, args);
    }

}
