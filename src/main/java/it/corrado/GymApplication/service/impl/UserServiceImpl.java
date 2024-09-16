package it.corrado.GymApplication.service.impl;

import it.corrado.GymApplication.dto.UserDto;
import it.corrado.GymApplication.mapper.UserMapper;
import it.corrado.GymApplication.model.User;
import it.corrado.GymApplication.repository.UserRepository;
import it.corrado.GymApplication.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final UserMapper userMapper;
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        userRepository.save(user);
        return userDto;
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        userRepository.delete(user);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Long id) {
        User user = userRepository.findById(id).orElseThrow();
        userMapper.updateUser(userDto,user);
        userRepository.save(user);
        return userMapper.userToUserDto(user);
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        return userMapper.userToUserDto(user);
    }

    @Override
    public List<UserDto> getUserBySurname(String surname) {
        List<User> userList =userRepository.findAllBySurname(surname);
        return userMapper.listToDtoList(userList);
    }

    @Override
    public List<UserDto> getUserByName(String name) {
        List<User> userList =userRepository.findAllByName(name);
        return userMapper.listToDtoList(userList);
    }

    @Override
    public UserDto getUserByCode(String code) {
        User user = userRepository.findByCode(code);
        return userMapper.userToUserDto(user);
    }

    @Override
    public UserDto getUserByPhone(String phone) {
        User user = userRepository.findByPhone(phone);
        return userMapper.userToUserDto(user);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return userMapper.userToUserDto(user);
    }


    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userMapper.listToDtoList(userList);
    }
}
