package it.corrado.GymApplication.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdNotFoundException extends RuntimeException implements CustomException{
    private final Long id;

    @Override
    public String getErrorMessage() {
        return "ID not found: " + id;
    }
}

