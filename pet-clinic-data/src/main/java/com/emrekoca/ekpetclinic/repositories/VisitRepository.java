package com.emrekoca.ekpetclinic.repositories;

import com.emrekoca.ekpetclinic.model.visit.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Emre.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
