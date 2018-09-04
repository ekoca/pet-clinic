package com.emrekoca.ekpetclinic.services.map;

import java.util.*;

/**
 * Created by Emre.
 */
public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    Optional<T> findById(ID id) {
        return Optional.of(map.get(id));
    }

    Optional<T> save(ID id, T object) {
        return Optional.of(map.put(id, object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
