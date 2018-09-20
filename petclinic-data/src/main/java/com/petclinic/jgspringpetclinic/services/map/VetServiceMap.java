package com.petclinic.jgspringpetclinic.services.map;

import com.petclinic.jgspringpetclinic.model.Vet;
import com.petclinic.jgspringpetclinic.services.BaseService;

import java.util.Set;

public class VetServiceMap extends AbstractBaseMap<Vet, Long> implements BaseService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
}
