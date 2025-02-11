package com.forrestgump.javagenerics.app.framework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InFileRepository<T> implements CrudRepository<T>, Serializable {
    private final String filePath;

    public InFileRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(T entity) {
        List<T> entities = findAll();
        entities.add(entity);
        writeFile(entities);
    }

    @Override
    public Optional<T> findById(int id) { // Mantendo a assinatura exatamente como a interface
        List<T> entities = findAll();
        return (id >= 0 && id < entities.size()) ? Optional.of(entities.get(id)) : Optional.empty();
    }

    @Override
    public void update(int id, T entity) { // Mantendo a assinatura exatamente como a interface
        List<T> entities = findAll();
        if (id >= 0 && id < entities.size()) {
            entities.set(id, entity);
            writeFile(entities);
        } else {
            System.out.println("Entity not found.");
        }
    }

    @Override
    public void delete(int id) { // Mantendo a assinatura exatamente como a interface
        List<T> entities = findAll();
        if (id >= 0 && id < entities.size()) {
            entities.remove(id);
            writeFile(entities);
        }
    }

    @Override
    public List<T> findAll() {
        File file = new File(filePath);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void writeFile(List<T> entities) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(entities);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
