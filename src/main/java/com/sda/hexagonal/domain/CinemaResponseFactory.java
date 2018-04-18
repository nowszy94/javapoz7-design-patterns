package com.sda.hexagonal.domain;

//@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CinemaResponseFactory {

    private static CinemaResponseFactory instance;

    public static CinemaResponseFactory instanceOf() {
        if (instance == null) {
            instance = new CinemaResponseFactory();
        }
        return instance;
    }

    private CinemaResponseFactory() {
    }

    public CinemaResponse createSuccessResponse() {
        return new CinemaResponse.CinemaResponseBuilder()
                .status(true)
                .message("Udalo sie zarezerwowac i wyslac bilet")
                .build();
    }

    public CinemaResponse createFailureResponse(String message) {
        return new CinemaResponse.CinemaResponseBuilder()
                .status(false)
                .message(message)
                .build();
    }
}
