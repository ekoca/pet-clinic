package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.Pet;
import com.emrekoca.ekpetclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Optional<Pet> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Pet> save(Pet owner) {
        return Optional.empty();
    }

    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Pet object) {

    }
}
