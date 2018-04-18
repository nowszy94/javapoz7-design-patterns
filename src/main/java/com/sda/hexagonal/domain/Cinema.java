package com.sda.hexagonal.domain;

public class Cinema {
    private CinemaReservationSystem cinemaReservationSystem;
    private CinemaNotificationSystem cinemaNotificationSystem;
    private CinemaResponseFactory cinemaResponseFactory;

    public Cinema(CinemaReservationSystem cinemaReservationSystem,
                  CinemaNotificationSystem cinemaNotificationSystem,
                  CinemaResponseFactory cinemaResponseFactory) {
        this.cinemaReservationSystem = cinemaReservationSystem;
        this.cinemaNotificationSystem = cinemaNotificationSystem;
        this.cinemaResponseFactory = cinemaResponseFactory;
    }

    public CinemaResponse book(CinemaRequest cinemaRequest) {
        CinemaReservationResponse response = cinemaReservationSystem.book(cinemaRequest);
        if (response.getStatus() != null) {
            return cinemaResponseFactory.createFailureResponse(response.getStatus().getMessage());
        }
        CinemaNotificationResponse notificationResponse = cinemaNotificationSystem.sendNotification(cinemaRequest);
        if (notificationResponse.getStatus() != null) {
            return cinemaResponseFactory.createFailureResponse(notificationResponse.getStatus().getMessage());
        }
        return cinemaResponseFactory.createSuccessResponse();
    }
}
