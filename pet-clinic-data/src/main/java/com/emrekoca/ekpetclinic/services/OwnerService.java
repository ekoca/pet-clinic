package com.emrekoca.ekpetclinic.services;

import com.emrekoca.ekpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Emre.
 */
public interface OwnerService {

    Owner findByid(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
