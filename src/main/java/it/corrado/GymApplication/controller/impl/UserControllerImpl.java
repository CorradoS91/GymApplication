package it.corrado.GymApplication.controller.impl;

import it.corrado.GymApplication.controller.UserController;
import it.corrado.GymApplication.dto.UserDto;
import it.corrado.GymApplication.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserControllerImpl implements UserController {
    @Autowired
    private final UserService userService;
    @Override
    public UserDto getUserById(Long id) {
        return userService.getUserById(id);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return userService.createUser(userDto);
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        return userService.updateUser(userDto,id);
    }

    @Override
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }
    @Override
    public UserDto getUserByCode(String code) {
        return userService.getUserByCode(code);
    }

    @Override
    public UserDto getUserByPhone(String phone) {
        return userService.getUserByPhone(phone);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        return userService.getUserByEmail(email);
    }
}
