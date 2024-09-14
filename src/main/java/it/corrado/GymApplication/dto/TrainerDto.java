package it.corrado.GymApplication.dto;

import jakarta.persistence.Column;
import lombok.*;

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
}
