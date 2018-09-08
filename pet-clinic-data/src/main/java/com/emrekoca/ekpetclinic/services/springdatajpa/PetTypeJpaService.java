package com.emrekoca.ekpetclinic.services.springdatajpa;

import com.emrekoca.ekpetclinic.model.PetType;
import com.emrekoca.ekpetclinic.repositories.PetTypeRepository;
import com.emrekoca.ekpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
@Service
@Profile("springdatajpa")
public class PetTypeJpaService implements PetTypeService {

    private final PetTypeRepository petTypeJpaService;

    public PetTypeJpaService(PetTypeRepository petTypeJpaService) {
        this.petTypeJpaService = petTypeJpaService;
    }

    @Override
    public Optional<PetType> findById(Long id) {
        return petTypeJpaService.findById(id);
    }

    @Override
    public Optional<PetType> save(PetType petType) {
        petTypeJpaService.save(petType);
        return Optional.of(petType);
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> types = new HashSet<>();
        petTypeJpaService.findAll().forEach(types::add);
        return types;
    }

    @Override
    public void delete(PetType petType) {
        petTypeJpaService.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        petTypeJpaService.deleteById(id);
    }
}
