package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.Vet;
import com.emrekoca.ekpetclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Optional<Vet> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Vet> save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}