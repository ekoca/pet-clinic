package com.emrekoca.ekpetclinic.services.springdatajpa;

import com.emrekoca.ekpetclinic.model.Speciality;
import com.emrekoca.ekpetclinic.repositories.SpecialitiesRepository;
import com.emrekoca.ekpetclinic.services.SpecialitiesService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
public class SpecialitiesJpaService implements SpecialitiesService {

    private final SpecialitiesRepository specialitiesRepository;

    public SpecialitiesJpaService(SpecialitiesRepository specialitiesRepository) {
        this.specialitiesRepository = specialitiesRepository;
    }

    @Override
    public Optional<Speciality> findById(Long id) {
        return specialitiesRepository.findById(id);
    }

    @Override
    public Optional<Speciality> save(Speciality speciality) {
        specialitiesRepository.save(speciality);
        return Optional.of(speciality);
    }

    @Override
    public Set<Speciality> findAll() {
        final Set<Speciality> specialities = new HashSet<>();
        specialitiesRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void delete(Speciality speciality) {
        specialitiesRepository.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        specialitiesRepository.deleteById(id);
    }
}
