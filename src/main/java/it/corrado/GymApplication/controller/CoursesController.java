package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.CourseDto;
import it.corrado.GymApplication.dto.RoomDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RequestMapping("/courses")
public interface CoursesController {
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.FOUND)
    List<CourseDto> getAllCourses();
}
