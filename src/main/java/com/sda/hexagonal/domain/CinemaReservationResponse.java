package com.sda.hexagonal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CinemaReservationResponse {
    private CinemaReservationStatus status;
}
