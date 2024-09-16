package it.corrado.GymApplication.service.impl;

import it.corrado.GymApplication.dto.CourseDto;
import it.corrado.GymApplication.mapper.CourseMapper;
import it.corrado.GymApplication.model.Course;
import it.corrado.GymApplication.repository.CourseRepository;
import it.corrado.GymApplication.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    @Autowired
    private final CourseMapper courseMapper;
    @Autowired
    private final CourseRepository courseRepository;
    @Override
    public CourseDto createCourse(CourseDto courseDto) {
        Course course = courseMapper.courseDtoToCourse(courseDto);
        courseRepository.save(course);
        return courseDto;
    }

    @Override
    public void deleteCourse(Long id) {
        Course course = courseRepository.findById(id).orElseThrow();
        courseRepository.delete(course);
    }

    @Override
    public CourseDto updateCourse(Long id,CourseDto courseDto) {
        Course course = courseRepository.findById(id).orElseThrow();
        courseMapper.updateCourse(courseDto,course);
        courseRepository.save(course);
        return courseDto;
    }

    @Override
    public CourseDto getCourseById(Long id) {
        Course course = courseRepository.findById(id).orElseThrow();
        return courseMapper.courseToCourseDto(course);
    }



    @Override
    public List<CourseDto> getAllCourses() {
        List<Course> courseList = courseRepository.findAll();
        return courseMapper.listToDtoList(courseList);
    }
}
