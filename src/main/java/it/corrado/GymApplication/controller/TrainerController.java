package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.TrainerDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/trainer")
public interface TrainerController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    TrainerDto getTrainerById(@PathVariable(name="id")Long id);
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    TrainerDto createTrainer(@RequestBody TrainerDto trainerDto);
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    TrainerDto updateTrainer(@PathVariable(name="id")Long id,@RequestBody TrainerDto trainerDto);
}
