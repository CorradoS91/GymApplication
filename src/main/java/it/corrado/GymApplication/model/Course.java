package it.corrado.GymApplication.model;

import jakarta.persistence.*;
import lombok.*;

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
}
