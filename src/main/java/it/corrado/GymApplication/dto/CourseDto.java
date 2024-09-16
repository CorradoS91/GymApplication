package it.corrado.GymApplication.dto;

import it.corrado.GymApplication.model.Room;
import it.corrado.GymApplication.model.Trainer;
import it.corrado.GymApplication.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
    private Long id;
    private String name;
    private List<User> users = new ArrayList<>();
    private List<Trainer> trainers = new ArrayList<>();
    private Room room;
}
