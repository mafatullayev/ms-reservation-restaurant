package com.example.msrestaurant.service.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface RestaurantService {
    void restaurants();
    void tables();
    void availableSlots();
}