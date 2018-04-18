package com.sda.hexagonal.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CinemaResponse {
    private boolean status;
    private String message;
}
