package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.Owner;
import com.emrekoca.ekpetclinic.services.OwnerService;
import com.emrekoca.ekpetclinic.services.PetService;
import com.emrekoca.ekpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
@Service
@Profile({"default", "mapservice"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Owner> save(Owner owner) {
        if (owner != null && owner.getPets() != null) {
            owner.getPets().stream().filter(pet -> pet.getType() != null).forEach(
                    pet ->pet.setType(petTypeService.save(pet.getType()).get())
            );

            owner.getPets().stream().filter(pet -> pet.getId() != null).forEach(
                    pet -> pet.setId(petService.save(pet).get().getId())
            );
        }
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
