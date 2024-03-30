package com.example.msreservation.mapper;

import com.example.msreservation.dao.entity.ReservationEntity;
import com.example.msreservation.model.request.ReservationRequest;
import com.example.msreservation.model.response.ReservationResponse;
import java.util.List;
import java.util.stream.Collectors;

public enum ReservationMapper {
    RESERVATION_MAPPER;

    public ReservationEntity buildReservationEntity(ReservationRequest reservationRequest) {
        return ReservationEntity.builder()
                .name(reservationRequest.getName())
                .time(reservationRequest.getDate())
                .build();
    }

    public ReservationResponse buildReservationResponse(ReservationEntity reservationEntity) {
        return ReservationResponse.builder()
                .id(reservationEntity.getId())
                .name(reservationEntity.getName())
                .time(reservationEntity.getTime())
                .build();
    }

    public List<ReservationResponse> buildReservationResponse(List<ReservationEntity> reservationEntities) {
        return reservationEntities.stream()
                .map(this::buildReservationResponse)
                .collect(Collectors.toList());

    }
}