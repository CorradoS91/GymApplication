package it.corrado.GymApplication.repository;

import it.corrado.GymApplication.dto.TrainerDto;
import it.corrado.GymApplication.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Long> {
    List<Trainer> findAllByName(String name);
    List<Trainer> findAllBySurname(String surname);
    Trainer findByPhone(String phone);
    Trainer findByEmail(String email);
}
