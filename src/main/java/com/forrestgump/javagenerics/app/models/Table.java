package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;

public class Table implements Serializable {
    private Integer tableNumber;
    private Integer capacity;
    private Boolean isOccupied;

    public Table(Integer tableNumber, Integer capacity, Boolean isOccupied) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = isOccupied;
    }

    @Override
    public String toString() {
        return "Table{tableNumber=" + tableNumber + ", capacity=" + capacity + ", isOccupied=" + isOccupied + "}";
    }
}
