package com.sda.hexagonal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CinemaNotificationResponse {
    private CinemaNotificationStatus status;
}
