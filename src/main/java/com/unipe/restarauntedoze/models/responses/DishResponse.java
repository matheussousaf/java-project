package com.unipe.restarauntedoze.models.responses;


import java.util.Date;

public class DishResponse {

    public int id;

    public String name;

    public String description;

    public double price;

    public boolean isDessert;

    public Date createdAt = new Date();

    public Date updatedAt = new Date();
}
