package com.unipe.restarauntedoze.repositories;

import com.unipe.restarauntedoze.models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
