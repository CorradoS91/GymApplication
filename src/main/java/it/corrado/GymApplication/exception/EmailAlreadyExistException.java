package it.corrado.GymApplication.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmailAlreadyExistException extends RuntimeException implements CustomException{
    private final String email;

    @Override
    public String getErrorMessage() {
        return "Email already registered: " + email;
    }
}
