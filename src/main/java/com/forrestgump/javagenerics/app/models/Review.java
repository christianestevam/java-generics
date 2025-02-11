package com.forrestgump.javagenerics.app.models;

import java.io.Serializable;

public class Review implements Serializable {
    private Integer reviewId;
    private Customer customer;
    private Restaurant restaurant;
    private String comment;
    private Integer rating;

    public Review(Integer reviewId, Customer customer, Restaurant restaurant, String comment, Integer rating) {
        this.reviewId = reviewId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.comment = comment;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{id=" + reviewId + ", customer=" + customer + ", restaurant=" + restaurant +
                ", comment='" + comment + "', rating=" + rating + "}";
    }
}
