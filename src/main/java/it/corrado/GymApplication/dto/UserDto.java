package it.corrado.GymApplication.dto;

import it.corrado.GymApplication.model.Course;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private String code;
    private LocalDate birthday;
    private String phone;
    private String email;
    private File certificate;
    private LocalDate validDate;
    private String subscription;
    private LocalDate sub_date;
    private List<Course> courses = new ArrayList<>();
}
