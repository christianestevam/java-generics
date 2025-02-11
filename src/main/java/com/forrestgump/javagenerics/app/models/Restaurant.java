package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;

public class Restaurant implements Serializable {
    private String name;
    private String address;
    private String phone;
    private String category;
    private Double rating;

    public Restaurant(String name, String address, String phone, String category, Double rating) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant{name='" + name + "', address='" + address + "', phone='" + phone +
                "', category='" + category + "', rating=" + rating + "}";
    }
}
