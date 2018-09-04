package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.Owner;
import com.emrekoca.ekpetclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Optional<Owner> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Owner> save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }
}
