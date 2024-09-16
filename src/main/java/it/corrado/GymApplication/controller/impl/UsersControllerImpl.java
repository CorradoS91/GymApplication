package it.corrado.GymApplication.controller.impl;

import it.corrado.GymApplication.controller.UserController;
import it.corrado.GymApplication.controller.UsersController;
import it.corrado.GymApplication.dto.UserDto;
import it.corrado.GymApplication.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UsersControllerImpl implements UsersController {
    @Autowired
    private final UserService userService;

    @Override
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }


}
