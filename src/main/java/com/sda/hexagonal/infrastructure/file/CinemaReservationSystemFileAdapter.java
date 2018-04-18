package com.sda.hexagonal.infrastructure.file;

import com.sda.hexagonal.domain.CinemaRequest;
import com.sda.hexagonal.domain.CinemaReservationResponse;
import com.sda.hexagonal.domain.CinemaReservationSystem;

public class CinemaReservationSystemFileAdapter implements CinemaReservationSystem {
    @Override
    public CinemaReservationResponse book(CinemaRequest cinemaRequest) {
        return null;
    }
}
