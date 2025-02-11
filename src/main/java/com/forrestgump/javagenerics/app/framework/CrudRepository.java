package com.forrestgump.javagenerics.app.framework;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    void save(T entity);
    Optional<T> findById(int id); // Retorna um Optional para evitar NullPointerException
    void update(int id, T entity);
    void delete(int id);
    List<T> findAll();
}
