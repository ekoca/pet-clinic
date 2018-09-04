package com.emrekoca.ekpetclinic.services;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Emre.
 */
public interface CrudService<T, ID> {
    Optional<T> findById(ID id);

    Optional<T> save(T owner);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
