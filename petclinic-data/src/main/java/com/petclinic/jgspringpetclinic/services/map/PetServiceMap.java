package com.petclinic.jgspringpetclinic.services.map;

import com.petclinic.jgspringpetclinic.model.Pet;
import com.petclinic.jgspringpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractBaseMap<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
}
