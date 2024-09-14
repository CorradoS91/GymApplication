package it.corrado.GymApplication.service;

import it.corrado.GymApplication.dto.TrainerDto;
import jakarta.persistence.Column;

public interface TrainerService {
    TrainerDto createTrainer(TrainerDto trainerDto);
    void deleteTrainer(Long id);
    TrainerDto updateTrainer(TrainerDto trainerDto, Long id);
    TrainerDto getTrainerById(Long id);
    TrainerDto getTrainerByName(String name);
    TrainerDto getTrainerBySurname(String surname);
    TrainerDto getTrainerByPhone(String phone);
    TrainerDto getTrainerByEmail(String email);
}
