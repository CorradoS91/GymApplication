package it.corrado.GymApplication.controller.impl;

import it.corrado.GymApplication.controller.CoursesController;
import it.corrado.GymApplication.controller.RoomsController;
import it.corrado.GymApplication.dto.CourseDto;
import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.service.CourseService;
import it.corrado.GymApplication.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CoursesControllerImpl implements CoursesController {
    @Autowired
    private final CourseService courseService;

    @Override
    public List<CourseDto> getAllCourses() {
        return courseService.getAllCourses();
    }

    @Override
    public List<CourseDto> getAllByCapacity(int capacity) {
        return courseService.getAllByCapacity(capacity);
    }
}
