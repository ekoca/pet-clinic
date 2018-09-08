package com.emrekoca.ekpetclinic.repositories;

import com.emrekoca.ekpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Emre.
 */
public interface SpecialitiesRepository extends CrudRepository<Speciality, Long> {
}
