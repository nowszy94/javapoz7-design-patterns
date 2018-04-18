package com.sda.di;

public class Cinema {
    private final CinemaReservation cinemaReservation;
    private final CinemaNotifier cinemaNotifier;

    //ZLE
    public Cinema() {
        this.cinemaReservation = new CinemaReservation();
        this.cinemaNotifier = new CinemaNotifier();
    }

    //DOBRZE
    public Cinema(CinemaReservation cinemaReservation , CinemaNotifier cinemaNotifier) {
        this.cinemaReservation = cinemaReservation;
        this.cinemaNotifier = cinemaNotifier;
    }

    public void book(String value) {

    }
}
