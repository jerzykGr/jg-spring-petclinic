package com.petcllinic.jgspringpetclinic.boostrap;

import com.petclinic.jgspringpetclinic.model.Owner;
import com.petclinic.jgspringpetclinic.services.OwnerService;
import com.petclinic.jgspringpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("firstname_1");
        owner1.setLastname("lastname_1");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("firstname_2");
        owner2.setLastname("lastname_2");

        ownerService.save(owner2);
    }
}
