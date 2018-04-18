package com.sda.hexagonal.domain;

public enum CinemaNotificationStatus {
    NO_DATA_PROVIDED("Nie podano wymaganych danych"),
    SERVER_ERROR("Nie udalo nam sie wyslac biletu");

    private String message;

    CinemaNotificationStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
