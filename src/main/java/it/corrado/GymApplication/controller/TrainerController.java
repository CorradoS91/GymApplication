package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.TrainerDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/trainer")
public interface TrainerController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    TrainerDto getTrainerById(@PathVariable(name="id")Long id);
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    TrainerDto createTrainer(@Valid @RequestBody TrainerDto trainerDto);
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    TrainerDto updateTrainer(@PathVariable(name="id")Long id,@Valid @RequestBody TrainerDto trainerDto);
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteTrainer(@PathVariable(name="id")Long id);
}
