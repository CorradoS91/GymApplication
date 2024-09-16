package it.corrado.GymApplication.mapper;

import it.corrado.GymApplication.dto.CourseDto;
import it.corrado.GymApplication.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CourseMapper {
    CourseDto courseToCourseDto(Course course);
    Course courseDtoToCourse(CourseDto courseDto);
    void updateCourse(CourseDto courseDto, @MappingTarget Course course);
    List<CourseDto> listToDtoList (List<Course> listCourse);
    List<Course> dtoListToList(List<CourseDto> dtoCourseList);
}
