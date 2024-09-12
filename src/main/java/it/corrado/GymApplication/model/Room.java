package it.corrado.GymApplication.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="Room")
@Table(name="ROOM")
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="CAPACITY_USERS")
    private int capacity;
    @Column(name="CURRENT_USERS")
    private int currentUsers;
    @Column(name="STATE_USERS")
    private boolean stateUsers;
    @Column(name="NAME")
    private String name;




}
