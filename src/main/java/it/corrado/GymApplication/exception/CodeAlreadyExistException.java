package it.corrado.GymApplication.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CodeAlreadyExistException extends RuntimeException implements CustomException{
    private final String code;

    @Override
    public String getErrorMessage() {
        return "Code already exist: " + code;
    }
}
