package com.forrestgump.javagenerics.app.models;


import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable {
    private Integer paymentId;
    private Order order;
    private Double amount;
    private String paymentMethod;
    private Date paymentDate;

    public Payment(Integer paymentId, Order order, Double amount, String paymentMethod, Date paymentDate) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{id=" + paymentId + ", order=" + order + ", amount=" + amount +
                ", method='" + paymentMethod + "', date=" + paymentDate + "}";
    }
}
