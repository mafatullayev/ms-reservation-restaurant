package com.example.msreservation.controller;

import com.example.msreservation.dao.entity.ReservationEntity;
import com.example.msreservation.service.concretes.ReservationServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/reservation")
public class ReservationController {
    @Autowired
    private ReservationServiceHandler reservationService;

    @PostMapping("v1/reserve")
    public ReservationEntity reserveTable(@RequestBody ReservationEntity reservationEntity) {
        return reservationService.makeReservation(reservationEntity);
    }

    @PostMapping("v1/cancel/{reservationId}")
    public void cancelReservation(@PathVariable Long reservationId) {
        reservationService.cancelReservation(reservationId);
    }
}