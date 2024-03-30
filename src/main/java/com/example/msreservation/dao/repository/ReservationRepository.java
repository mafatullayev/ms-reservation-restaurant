package com.example.msreservation.dao.repository;

import com.example.msreservation.dao.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
    @Override
    Optional<ReservationEntity> findById(Long id);
}