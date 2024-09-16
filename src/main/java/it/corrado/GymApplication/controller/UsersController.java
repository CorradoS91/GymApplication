package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.UserDto;
import it.corrado.GymApplication.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RequestMapping("/users")
public interface UsersController {
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.FOUND)
    List<UserDto> getAllUsers();

}
