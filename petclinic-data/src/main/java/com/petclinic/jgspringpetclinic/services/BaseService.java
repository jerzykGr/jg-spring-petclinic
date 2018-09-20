package com.petclinic.jgspringpetclinic.services;

import java.util.Set;

public interface BaseService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(ID id);
}
