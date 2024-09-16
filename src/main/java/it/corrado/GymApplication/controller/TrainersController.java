package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.TrainerDto;
import it.corrado.GymApplication.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RequestMapping("/trainers")
public interface TrainersController {
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.FOUND)
    List<TrainerDto> getAllTrainers();
}
