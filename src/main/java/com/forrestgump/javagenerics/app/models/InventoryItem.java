package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;

public class InventoryItem implements Serializable {
    private Integer itemId;
    private String name;
    private Integer quantity;
    private Supplier supplier;

    public InventoryItem(Integer itemId, String name, Integer quantity, Supplier supplier) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "InventoryItem{id=" + itemId + ", name='" + name + "', quantity=" + quantity + ", supplier=" + supplier + "}";
    }
}
