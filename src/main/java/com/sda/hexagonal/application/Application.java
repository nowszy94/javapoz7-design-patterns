package com.sda.hexagonal.application;

import com.sda.hexagonal.domain.Cinema;
import com.sda.hexagonal.domain.CinemaResponseFactory;
import com.sda.hexagonal.infrastructure.file.CinemaReservationSystemFileAdapter;

public class Application {
    public static void main(String[] args) {
        CinemaReservationSystemFileAdapter reservation = new CinemaReservationSystemFileAdapter();
        Cinema cinema = new Cinema(reservation, null, CinemaResponseFactory.instanceOf());

    }
}
