package it.corrado.GymApplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="User")
@Table(name="USER_GYM")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
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
    @Pattern(regexp = "^[A-Z]{6}\\d{8}[A-Z0-9]$",message = "Code not valid")
    @Column(name="CODE",unique = true)
    private String code;
    @NotBlank
    @NotNull
    @Column(name="BIRTHDAY")
    private LocalDate birthday;
    @NotBlank
    @NotNull
    @Pattern(regexp = "^(\\d{10}|\\d{3}[\\s-]?\\d{3}[\\s-]?\\d{4}|\\d{2}[\\s-]?\\d{4}[\\s-]?\\d{4})$")
    @Column(name="PHONE",unique = true)
    private String phone;
    @NotBlank
    @NotNull
    @Column(name="EMAIL",unique = true)
    private String email;
    @Column(name="CERTIFICATE")
    private File certificate;
    @NotBlank
    @NotNull
    @Column(name="VALID_DATE")
    private LocalDate validDate;
    @NotBlank
    @NotNull
    @Column(name="SUBSCRIPTION")
    private String subscription;
    @NotBlank
    @NotNull
    @Column(name="SUB_DATE")
    private LocalDate sub_date;
    @ManyToMany
    @JoinTable(
            name = "USER_COURSE",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_ID")
    )
    private List<Course> courses = new ArrayList<>();

}
