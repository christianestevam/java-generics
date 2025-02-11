package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {
    private Integer reservationId;
    private Customer customer;
    private Table table;
    private Date reservationDate;
    private Integer numberOfGuests;

    public Reservation(Integer reservationId, Customer customer, Table table, Date reservationDate, Integer numberOfGuests) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.table = table;
        this.reservationDate = reservationDate;
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        return "Reservation{id=" + reservationId + ", customer=" + customer + ", table=" + table +
                ", reservationDate=" + reservationDate + ", numberOfGuests=" + numberOfGuests + "}";
    }
}
