package com.unipe.restarauntedoze.services;

import com.unipe.restarauntedoze.models.Dish;
import com.unipe.restarauntedoze.models.requests.DishRequest;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DishService {

    Dish getSingleDish(Long id);

    List<Dish> getAllDishes();

    Dish createDish(Dish dish);

    Dish editDish(Long id, DishRequest request);

    void deleteDish(Long id);
}
