package com.example.msreservation.service.abstracts;

import com.example.msreservation.model.request.ReservationRequest;
import org.springframework.stereotype.Service;

@Service
public interface ReservationService {
    void getReserve(ReservationRequest request);
    void test();
}