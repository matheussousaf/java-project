package com.unipe.restarauntedoze.business;

import com.unipe.restarauntedoze.models.Dish;
import com.unipe.restarauntedoze.models.requests.DishRequest;
import com.unipe.restarauntedoze.repositories.DishRepository;
import com.unipe.restarauntedoze.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishBusiness implements DishService {

    @Autowired
    DishRepository repository;

    @Override
    public List<Dish> getAllDishes() {
        return repository.findAll();
    };

    public Dish getSingleDish(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Dish createDish(Dish dish) {
        return repository.save(dish);
    }

    @Override
    public Dish editDish(Long id, DishRequest request) {
        Dish existingDish = repository.findById(id).orElse(null);
        existingDish.setName(request.getName());
        existingDish.setDescription(request.getDescription());
        existingDish.setPrice(request.getPrice());
        return repository.save(existingDish);
    }

    @Override
    public void deleteDish(Long id) {
        repository.deleteById(id);
    }
}