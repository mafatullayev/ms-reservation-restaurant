package com.example.msreservation.service.concretes;

import com.example.msreservation.client.RestaurantClient;
import com.example.msreservation.dao.entity.ReservationEntity;
import com.example.msreservation.dao.repository.ReservationRepository;
import com.example.msreservation.model.request.ReservationRequest;
import com.example.msreservation.service.abstracts.ReservationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.example.msreservation.mapper.ReservationMapper.RESERVATION_MAPPER;

@Slf4j
@RequiredArgsConstructor
@Service
public class ReservationServiceHandler implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final RestaurantClient restaurantClient;

    @Override
    public void getReserve(ReservationRequest request) {
        if (restaurantClient.getReservationResponse(request.getId()) == null) {
            throw new RuntimeException("Reserved table not found!");
        }
        log.info("ActionLog started: {}", request);
        reservationRepository.save(RESERVATION_MAPPER.buildReservationEntity(request));
        log.info("ActionLog ended: {}", request);
    }

    private ReservationEntity reservationEntity(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reserve not found!"));

    }
}