package com.example.msreservation.client;

import com.example.msreservation.model.response.ReservationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-restaurant")
public interface RestaurantClient {

    @GetMapping("internal/v1/restaurants/{id}")
    ReservationResponse getReservationResponse(@PathVariable Long id);
}
