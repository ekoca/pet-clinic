package com.emrekoca.ekpetclinic.repositories;

import com.emrekoca.ekpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Emre.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
