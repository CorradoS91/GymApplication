package it.corrado.GymApplication.mapper;

import it.corrado.GymApplication.dto.UserDto;
import it.corrado.GymApplication.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto userDto);
    void updateUser(UserDto userDto, @MappingTarget User user);
}
