package it.corrado.GymApplication.repository;

import it.corrado.GymApplication.dto.CourseDto;
import it.corrado.GymApplication.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findAllByName(String name);
    List<Course> findAllByCapacity(int capacity);
}
