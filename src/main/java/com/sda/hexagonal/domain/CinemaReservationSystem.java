package com.sda.hexagonal.domain;


public interface CinemaReservationSystem {
    CinemaReservationResponse book(CinemaRequest cinemaRequest);
}
