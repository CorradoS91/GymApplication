package it.corrado.GymApplication.service;

import it.corrado.GymApplication.dto.CourseDto;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.List;

public interface CourseService {
    CourseDto createCourse(CourseDto courseDto);
    void deleteCourse(Long id);
    CourseDto updateCourse(Long id,CourseDto courseDto);
    CourseDto getCourseById(Long id);
    List<CourseDto> getAllCourses();
    List<CourseDto> getAllByCapacity(int capacity);
}
