package it.corrado.GymApplication.service.impl;

import it.corrado.GymApplication.dto.TrainerDto;
import it.corrado.GymApplication.mapper.TrainerMapper;
import it.corrado.GymApplication.model.Trainer;
import it.corrado.GymApplication.model.User;
import it.corrado.GymApplication.repository.TrainerRepository;
import it.corrado.GymApplication.service.TrainerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    @Autowired
    private final TrainerRepository trainerRepository;
    @Autowired
    private final TrainerMapper trainerMapper;
    @Override
    public TrainerDto createTrainer(TrainerDto trainerDto) {
        Trainer trainer = trainerMapper.trainerDtoToTrainer(trainerDto);
        trainerRepository.save(trainer);
        return trainerDto;
    }

    @Override
    public void deleteTrainer(Long id) {
        Trainer trainer = trainerRepository.findById(id).orElseThrow();
        trainerRepository.delete(trainer);
    }

    @Override
    public TrainerDto updateTrainer(TrainerDto trainerDto, Long id) {
        Trainer trainer = trainerRepository.findById(id).orElseThrow();
        trainerMapper.updateTrainer(trainerDto,trainer);
        trainerRepository.save(trainer);
        return trainerDto;
    }

    @Override
    public TrainerDto getTrainerById(Long id) {
        Trainer trainer = trainerRepository.findById(id).orElseThrow();
        return trainerMapper.trainerToTrainerDto(trainer);
    }

    @Override
    public TrainerDto getTrainerByName(String name) {
        return null;
    }

    @Override
    public TrainerDto getTrainerBySurname(String surname) {
        return null;
    }

    @Override
    public TrainerDto getTrainerByPhone(String phone) {
        return null;
    }

    @Override
    public TrainerDto getTrainerByEmail(String email) {
        return null;
    }
}
