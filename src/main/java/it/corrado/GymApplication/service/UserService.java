package it.corrado.GymApplication.service;

import it.corrado.GymApplication.dto.UserDto;
import jakarta.persistence.Column;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    void deleteUser(Long id);
    UserDto updateUser(UserDto userDto, Long id);
    UserDto getUserById(Long id);
    List<UserDto> getUserBySurname(String surname);
    List<UserDto> getUserByName(String name);
    UserDto getUserByCode(String code);
    UserDto getUserByPhone(String phone);
    UserDto getUserByEmail(String email);
    List<UserDto> getAllUsers();
}
