package it.corrado.GymApplication.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.io.File;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="User")
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private Long id;
    @Column(name="NAME")
    private String name;
    @Column(name="SURNAME")
    private String surname;
    @Column(name="CODE",unique = true, nullable = false)
    private String code;
    @Column(name="BIRTHDAY")
    private LocalDate birthday;
    @Column(name="PHONE",unique = true, nullable = false)
    private String phone;
    @Column(name="EMAIL",unique = true, nullable = false)
    private String email;
    @Column(name="CERTIFICATE")
    private File certificate;
    @Column(name="SUBSCRIPTION")
    private String subscription;
    @Column(name="SUB_DATE")
    private LocalDate sub_date;

}
