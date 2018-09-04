package com.emrekoca.ekpetclinic.services;

import com.emrekoca.ekpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Emre.
 */
public interface PetService {

    Pet findByid(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
