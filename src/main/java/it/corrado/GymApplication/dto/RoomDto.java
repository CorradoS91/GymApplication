package it.corrado.GymApplication.dto;

import it.corrado.GymApplication.model.Course;
import jakarta.persistence.Column;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    private Long id;
    private List<Course> courses = new ArrayList<>();
    private String name;
}
