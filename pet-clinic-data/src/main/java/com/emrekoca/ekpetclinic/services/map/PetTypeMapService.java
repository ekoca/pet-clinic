package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.PetType;
import com.emrekoca.ekpetclinic.services.PetTypeService;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Optional<PetType> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<PetType> save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }
}
