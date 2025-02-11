package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
    private Integer orderId;
    private Customer customer;
    private List<MenuItem> items;
    private Double totalAmount;
    private Date orderDate;
    private String status;

    public Order(Integer orderId, Customer customer, List<MenuItem> items, Double totalAmount, Date orderDate, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.status = status;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customer=" + customer + ", items=" + items +
                ", totalAmount=" + totalAmount + ", orderDate=" + orderDate + ", status='" + status + "'}";
    }
}
