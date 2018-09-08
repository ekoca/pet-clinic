package com.emrekoca.ekpetclinic.services.springdatajpa;

import com.emrekoca.ekpetclinic.model.Vet;
import com.emrekoca.ekpetclinic.repositories.VetRepository;
import com.emrekoca.ekpetclinic.services.VetService;
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
public class VetJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetJpaService(final VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Optional<Vet> findById(Long id) {
        return vetRepository.findById(id);
    }

    @Override
    public Optional<Vet> save(Vet vet) {
        vetRepository.save(vet);
        return Optional.of(vet);
    }

    @Override
    public Set<Vet> findAll() {
        final Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
