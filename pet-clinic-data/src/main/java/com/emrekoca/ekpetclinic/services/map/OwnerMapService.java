package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.Owner;
import com.emrekoca.ekpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Optional<Owner> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Owner> save(Owner owner) {
        return super.save(owner);
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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
