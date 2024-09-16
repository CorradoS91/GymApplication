package it.corrado.GymApplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="Trainer")
@Table(name="TRAINER")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @NotNull
    @Column(name="NAME")
    private String name;
    @NotBlank
    @NotNull
    @Column(name="SURNAME")
    private String surname;
    @NotBlank
    @NotNull
    @Pattern(regexp = "^(\\d{10}|\\d{3}[\\s-]?\\d{3}[\\s-]?\\d{4}|\\d{2}[\\s-]?\\d{4}[\\s-]?\\d{4})$")
    @Column(name="PHONE" ,unique = true)
    private String phone;
    @NotBlank
    @NotNull
    @Email
    @Column(name="EMAIL",unique = true)
    private String email;
    @ManyToMany
    @JoinTable(
            name = "TRAINER_COURSE",
            joinColumns = @JoinColumn(name = "TRAINER_ID"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_ID")
    )
    private List<Course> courses = new ArrayList<>();

}
