package com.unipe.restarauntedoze.controllers;

import com.unipe.restarauntedoze.business.DishBusiness;
import com.unipe.restarauntedoze.models.Dish;
import com.unipe.restarauntedoze.models.requests.DishRequest;
import com.unipe.restarauntedoze.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DishController {

    @Autowired
    public DishService service;

    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    private Dish getSingleDish(@RequestParam Long id) {
        return service.getSingleDish(id);
    }

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    private List<Dish> getDishes() {
        return service.getAllDishes();
    }

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    private Dish createDish(@RequestBody Dish request) {
        return service.createDish(request);
    }

    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    private Dish editDish(@PathVariable("id") Long id, @RequestBody DishRequest request) {
        return service.editDish(id, request);
    }

    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
    private void deleteDish(@PathVariable("id") Long id) {
        service.deleteDish(id);
    }



}
