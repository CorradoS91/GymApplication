package it.corrado.GymApplication.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="Course")
@Table(name="COURSE")
public class Course {
    @Id
    @Column(name="COURSE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="NAME")
    private String name;
    @ManyToMany(mappedBy = "courses")
    private List<User> users = new ArrayList<>();
    @ManyToMany(mappedBy = "courses")
    private List<Trainer> trainers = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "ROOM_ID")
    private Room room;
}
