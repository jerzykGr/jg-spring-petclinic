package com.petclinic.jgspringpetclinic.services.map;

import com.petclinic.jgspringpetclinic.model.Pet;
import com.petclinic.jgspringpetclinic.services.BaseService;

import java.util.Set;

public class PetServiceMap extends AbstractBaseMap<Pet, Long> implements BaseService<Pet, Long> {
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
