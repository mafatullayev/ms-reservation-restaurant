package com.example.msrestaurant.controller;

import com.example.msrestaurant.service.abstracts.RestaurantService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("v1/restaurants")
public class RestaurantController implements RestaurantService {
    private RestaurantService abstractRestaurantService;

    @Override
    @GetMapping
    public void restaurants() {
        var restaurants = this.abstractRestaurantService;
    }

    @Override
    @GetMapping("/tables")
    public void tables() {
        var tables = this.abstractRestaurantService;
    }

    @Override
    @GetMapping("/slots")
    public void availableSlots() {
        var slots = this.abstractRestaurantService;
    }
}