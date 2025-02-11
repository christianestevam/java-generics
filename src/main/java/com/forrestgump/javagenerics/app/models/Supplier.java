package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;

public class Supplier implements Serializable {
    private Integer supplierId;
    private String name;
    private String contact;
    private String address;

    public Supplier(Integer supplierId, String name, String contact, String address) {
        this.supplierId = supplierId;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{id=" + supplierId + ", name='" + name + "', contact='" + contact +
                "', address='" + address + "'}";
    }
}
