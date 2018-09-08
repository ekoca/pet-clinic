package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.visit.Visit;
import com.emrekoca.ekpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
@Service
@Profile({"default", "mapservice"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Optional<Visit> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Visit> save(Visit visit) {
        return super.save(visit);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }
}
