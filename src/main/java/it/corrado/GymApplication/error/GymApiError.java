package it.corrado.GymApplication.error;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
public class GymApiError {
    private Instant timestamp;
    private int status;
    private String message;
    private String path;
}
