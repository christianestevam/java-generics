package com.forrestgump.javagenerics.app.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryRepository<T> implements CrudRepository<T> {
    private final List<T> entities = new ArrayList<>();

    @Override
    public void save(T entity) {
        entities.add(entity);
    }

    @Override
    public Optional<T> findById(int id) {
        return (id >= 0 && id < entities.size()) ? Optional.of(entities.get(id)) : Optional.empty();
    }

    @Override
    public void update(int id, T entity) {
        if (id >= 0 && id < entities.size()) {
            entities.set(id, entity);
        } else {
            System.out.println("Entity not found.");
        }
    }

    @Override
    public void delete(int id) {
        if (id >= 0 && id < entities.size()) {
            entities.remove(id);
        }
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(entities);
    }
}
