package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;
import java.util.Date;

public class Delivery implements Serializable {
    private Integer deliveryId;
    private Order order;
    private String deliveryAddress;
    private Date estimatedDeliveryTime;

    public Delivery(Integer deliveryId, Order order, String deliveryAddress, Date estimatedDeliveryTime) {
        this.deliveryId = deliveryId;
        this.order = order;
        this.deliveryAddress = deliveryAddress;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    @Override
    public String toString() {
        return "Delivery{id=" + deliveryId + ", order=" + order + ", address='" + deliveryAddress +
                "', estimatedDeliveryTime=" + estimatedDeliveryTime + "}";
    }
}
