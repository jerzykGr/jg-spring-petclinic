package com.petclinic.jgspringpetclinic.services;

import com.petclinic.jgspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner fingByLastname(String lastname);

    Owner findById(Long ownerId);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
