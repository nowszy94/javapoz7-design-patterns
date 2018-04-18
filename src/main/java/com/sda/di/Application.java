package com.sda.di;

public class Application {
    public static void main(String[] args) {
        CinemaNotifier cinemaNotifier = new CinemaNotifier();
        CinemaReservation cinemaReservation = new CinemaReservation();
        Cinema cinema = new Cinema(cinemaReservation, cinemaNotifier);
    }
}
