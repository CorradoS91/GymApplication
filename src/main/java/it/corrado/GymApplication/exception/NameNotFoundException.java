package it.corrado.GymApplication.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public class NameNotFoundException extends RuntimeException implements CustomException{
    private final String name;

    @Override
    public String getErrorMessage() {
        return "Name not found: " + name;
    }
}
