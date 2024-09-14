package it.corrado.GymApplication.service;

import it.corrado.GymApplication.dto.CourseDto;
import jakarta.persistence.Column;

import java.time.LocalDate;

public interface CourseService {
    CourseDto createCourse(CourseDto courseDto);
    void deleteCourse(Long id);
    CourseDto updateCourse(Long id,CourseDto courseDto);
    CourseDto getCourseById(Long id);
    CourseDto getCourseByName(String name);
    CourseDto getCourseByStart(LocalDate start);
    CourseDto getCourseByEnd(LocalDate end);
    CourseDto getCourseByState(String status);
}
