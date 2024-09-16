package it.corrado.GymApplication.dto;

import it.corrado.GymApplication.model.Course;
import jakarta.persistence.Column;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerDto {
    private Long id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private List<Course> courses = new ArrayList<>();
}
