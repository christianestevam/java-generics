package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private String phone;
    private String email;
    private String address;

    public Customer(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', phone='" + phone + "', email='" + email +
                "', address='" + address + "'}";
    }
}
