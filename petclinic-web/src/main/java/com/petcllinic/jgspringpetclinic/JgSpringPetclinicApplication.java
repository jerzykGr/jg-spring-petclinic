package com.petcllinic.jgspringpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.petclinic.jgspringpetclinic.services",
        "com.petcllinic.jgspringpetclinic"})
public class JgSpringPetclinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(JgSpringPetclinicApplication.class, args);
    }
}
