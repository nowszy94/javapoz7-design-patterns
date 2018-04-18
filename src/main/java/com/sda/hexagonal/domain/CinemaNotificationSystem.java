package com.sda.hexagonal.domain;

public interface CinemaNotificationSystem {
    CinemaNotificationResponse sendNotification(CinemaRequest cinemaRequest);
}
