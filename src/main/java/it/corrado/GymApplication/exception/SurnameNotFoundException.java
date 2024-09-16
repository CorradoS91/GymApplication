package it.corrado.GymApplication.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SurnameNotFoundException extends RuntimeException implements CustomException{
    private final String surname;

    @Override
    public String getErrorMessage() {
        return "Surname not found: " + surname;
    }
}
