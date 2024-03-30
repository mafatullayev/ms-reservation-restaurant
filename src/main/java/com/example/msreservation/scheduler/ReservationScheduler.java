package com.example.msreservation.scheduler;

import com.example.msreservation.service.abstracts.ReservationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ReservationScheduler {
    private final ReservationService reservationService;

    @Async
    @Scheduled(cron = "* 15 * * * *")
    public void reserveScheduler() {
        log.info("ReservationScheduler started:");
        reservationService.test();
        log.info("ReservationScheduler ended:");
    }
}
