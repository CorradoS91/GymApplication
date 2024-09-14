package it.corrado.GymApplication.mapper;

import it.corrado.GymApplication.dto.TrainerDto;
import it.corrado.GymApplication.model.Trainer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TrainerMapper {
    TrainerDto trainerToTrainerDto(Trainer trainer);
    Trainer trainerDtoToTrainer(TrainerDto trainerDto);
    void updateTrainer(TrainerDto trainerDto, @MappingTarget Trainer trainer);
}
