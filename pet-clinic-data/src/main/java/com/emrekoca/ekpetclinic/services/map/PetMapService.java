package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.Pet;
import com.emrekoca.ekpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
@Service
@Profile({"default", "mapservice"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Optional<Pet> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Pet> save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
