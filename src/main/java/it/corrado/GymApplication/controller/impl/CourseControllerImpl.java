package it.corrado.GymApplication.controller.impl;

import it.corrado.GymApplication.controller.CourseController;
import it.corrado.GymApplication.dto.CourseDto;
import it.corrado.GymApplication.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CourseControllerImpl implements CourseController {
    @Autowired
    private final CourseService courseService;
    @Override
    public CourseDto getCourseById(Long id) {
        return courseService.getCourseById(id);
    }
    @Override
    public CourseDto createCourse(CourseDto courseDto) {
        return courseService.createCourse(courseDto);
    }

    @Override
    public CourseDto updateCourse(Long id,CourseDto courseDto) {
        return courseService.updateCourse(id,courseDto);
    }

    @Override
    public void deleteCourse(Long id) {
    courseService.deleteCourse(id);
    }
}
