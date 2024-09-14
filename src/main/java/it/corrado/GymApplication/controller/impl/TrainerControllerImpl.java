package it.corrado.GymApplication.controller.impl;

import it.corrado.GymApplication.controller.TrainerController;
import it.corrado.GymApplication.dto.TrainerDto;
import it.corrado.GymApplication.service.TrainerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TrainerControllerImpl implements TrainerController {
    @Autowired
    private final TrainerService trainerService;

    @Override
    public TrainerDto getTrainerById(Long id) {
        return trainerService.getTrainerById(id);
    }

    @Override
    public TrainerDto createTrainer(TrainerDto trainerDto) {
        return trainerService.createTrainer(trainerDto);
    }

    @Override
    public TrainerDto updateTrainer(Long id, TrainerDto trainerDto) {
        return trainerService.updateTrainer(trainerDto,id);
    }
}
