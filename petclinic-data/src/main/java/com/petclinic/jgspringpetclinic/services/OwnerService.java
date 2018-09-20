package com.petclinic.jgspringpetclinic.services;

import com.petclinic.jgspringpetclinic.model.Owner;

public interface OwnerService extends BaseService<Owner, Long> {

    Owner fingByLastname(String lastname);

}
