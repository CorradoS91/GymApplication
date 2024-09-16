package it.corrado.GymApplication.controller.impl;

import it.corrado.GymApplication.controller.RoomsController;
import it.corrado.GymApplication.controller.UsersController;
import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.dto.UserDto;
import it.corrado.GymApplication.service.RoomService;
import it.corrado.GymApplication.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RoomsControllerImpl implements RoomsController {
    @Autowired
    private final RoomService roomService;

    @Override
    public List<RoomDto> getAllRooms() {
        return roomService.getAllRooms();
    }
}
