package com.emrekoca.ekpetclinic.services.map;

import com.emrekoca.ekpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by Emre.
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    Optional<T> findById(ID id) {
        return Optional.of(map.get(id));
    }

    Optional<T> save(T t) {
        if (t != null && t.getId() == null) {
            t.setId(generateId().orElse(1l));
        }

        map.put(t.getId(), t);
        return Optional.of(t);
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    private Optional<Long> generateId() {
        if (map.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(Collections.max(map.keySet()) + 1);
    }
}
