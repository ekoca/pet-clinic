package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.Speciality;
import com.emrekoca.ekpetclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
@Service
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Optional<Speciality> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Speciality> save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }
}
