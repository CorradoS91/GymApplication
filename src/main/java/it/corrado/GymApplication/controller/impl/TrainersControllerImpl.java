package it.corrado.GymApplication.controller.impl;

import it.corrado.GymApplication.controller.TrainersController;
import it.corrado.GymApplication.controller.UsersController;
import it.corrado.GymApplication.dto.TrainerDto;
import it.corrado.GymApplication.dto.UserDto;
import it.corrado.GymApplication.model.Trainer;
import it.corrado.GymApplication.service.TrainerService;
import it.corrado.GymApplication.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class TrainersControllerImpl implements TrainersController {
    @Autowired
    private final TrainerService trainerService;


    @Override
    public List<TrainerDto> getAllTrainers() {
        return trainerService.getAllTrainers();
    }
}
