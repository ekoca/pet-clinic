package com.emrekoca.ekpetclinic.repositories;

import com.emrekoca.ekpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Emre.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
