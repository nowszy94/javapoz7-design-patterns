package com.sda.hexagonal.domain;

public enum CinemaReservationStatus {
    ALREADY_BOOKED("Wybrane miejsce bylo juz zajete"),
    INVALID_NUMBER("Wybrane miejsce jest niepoprawne");

    private String message;

    CinemaReservationStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
