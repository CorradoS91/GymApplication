package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.CourseDto;
import it.corrado.GymApplication.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/user")
public interface UserController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    UserDto getUserById(@PathVariable(name="id")Long id);
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UserDto createUser(@Valid @RequestBody UserDto userDto);
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    UserDto updateUser(@PathVariable(name="id")Long id,@Valid @RequestBody UserDto userDto);
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteUser(@PathVariable(name="id")Long id);
    @GetMapping("/{code}")
    @ResponseStatus(HttpStatus.FOUND)
    UserDto getUserByCode(String code);
    @GetMapping("/{phone}")
    @ResponseStatus(HttpStatus.FOUND)
    UserDto getUserByPhone(String phone);
    @GetMapping("/{email}")
    @ResponseStatus(HttpStatus.FOUND)
    UserDto getUserByEmail(String email);
}
