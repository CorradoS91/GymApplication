package it.corrado.GymApplication.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    private Long id;
    private int capacity;
    private int currentUsers;
    private boolean stateUsers;
    private String name;
}
