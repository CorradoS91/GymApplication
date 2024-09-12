package it.corrado.GymApplication.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

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
    @Column(name="COURSE_START")
    private LocalDate courseStart;
    @Column(name="COURSE_END")
    private LocalDate courseEnd;
    @Column(name="STATUS")
    private String status;
}
