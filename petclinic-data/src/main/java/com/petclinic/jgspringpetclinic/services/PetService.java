package com.petclinic.jgspringpetclinic.services;

import com.petclinic.jgspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long petId);

    Set<Pet> findAll();

    Pet save(Pet pet);
}
