package it.corrado.GymApplication.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public class IdNotFoundException extends RuntimeException implements CustomException{
    private final Long id;

    @Override
    public String getErrorMessage() {
        return "ID not found: " + id;
    }
}

