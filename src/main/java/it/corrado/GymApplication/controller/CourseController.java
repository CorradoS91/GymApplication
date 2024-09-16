package it.corrado.GymApplication.controller;

import it.corrado.GymApplication.dto.CourseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/course")
public interface CourseController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    CourseDto getCourseById(@PathVariable(name="id")Long id);
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CourseDto createCourse(@Valid @RequestBody CourseDto courseDto);
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    CourseDto updateCourse(@PathVariable(name="id")Long id,@Valid @RequestBody CourseDto courseDto);
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteCourse(@PathVariable(name="id")Long id);

}
