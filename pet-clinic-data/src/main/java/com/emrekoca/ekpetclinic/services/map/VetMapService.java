package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.Vet;
import com.emrekoca.ekpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitiesMapService specialitiesMapService;

    public VetMapService(SpecialitiesMapService specialitiesMapService) {
        this.specialitiesMapService = specialitiesMapService;
    }

    @Override
    public Optional<Vet> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Vet> save(Vet vet) {
        if (vet != null && vet.getSpecialities() != null) {
            vet.getSpecialities().stream().filter(s -> s.getId() != null).forEach(
                    s -> s.setId(specialitiesMapService.save(s).get().getId())
            );
        }
        return super.save(vet);
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
