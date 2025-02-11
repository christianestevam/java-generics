package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;

public class MenuItem implements Serializable {
    private String name;
    private String description;
    private Double price;

    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{name='" + name + "', description='" + description + "', price=" + price + "}";
    }
}
