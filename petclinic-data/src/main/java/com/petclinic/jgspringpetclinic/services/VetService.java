package com.petclinic.jgspringpetclinic.services;

import com.petclinic.jgspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long vetId);

    Set<Vet> findAll();

    Vet save(Vet vet);
}
