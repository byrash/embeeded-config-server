package com.shivaji.embeededconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigServer
public class EmbeededConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmbeededConfigServerApplication.class, args);
    }

}
