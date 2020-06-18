package com.unipe.restarauntedoze.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DishRequest {
    private String name;

    private String description;

    private boolean isDessert;

    private double price;
}
