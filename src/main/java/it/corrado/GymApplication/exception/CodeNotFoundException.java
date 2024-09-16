package it.corrado.GymApplication.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CodeNotFoundException extends RuntimeException implements CustomException{
    private final String code;

    @Override
    public String getErrorMessage() {
        return "Code not found: " + code;
    }
}