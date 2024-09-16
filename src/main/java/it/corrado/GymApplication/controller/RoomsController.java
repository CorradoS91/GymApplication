package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.dto.TrainerDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RequestMapping("/rooms")
public interface RoomsController {
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.FOUND)
    List<RoomDto> getAllRooms();
}
