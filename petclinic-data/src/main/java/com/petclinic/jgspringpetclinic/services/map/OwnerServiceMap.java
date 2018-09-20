package com.petclinic.jgspringpetclinic.services.map;

import com.petclinic.jgspringpetclinic.model.Owner;
import com.petclinic.jgspringpetclinic.services.BaseService;

import java.util.Set;

public class OwnerServiceMap extends AbstractBaseMap<Owner, Long> implements BaseService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
}
