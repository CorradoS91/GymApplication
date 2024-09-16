package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/room")
public interface RoomController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    RoomDto getRoomById(@PathVariable(name="id")Long id);
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    RoomDto createRoom(@Valid @RequestBody RoomDto roomDto);
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    RoomDto updateRoom(@PathVariable(name="id")Long id,@Valid @RequestBody RoomDto roomDto);
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteRoom(@PathVariable(name="id")Long id);
}
