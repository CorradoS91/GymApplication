package it.corrado.GymApplication.controller.impl;

import it.corrado.GymApplication.controller.RoomController;
import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RoomControllerImpl implements RoomController {
    @Autowired
    private final RoomService roomService;

    @Override
    public RoomDto getRoomById(Long id) {
        return roomService.getRoomById(id);
    }

    @Override
    public RoomDto createRoom(RoomDto roomDto) {
        return roomService.createRoom(roomDto);
    }

    @Override
    public RoomDto updateRoom(Long id, RoomDto roomDto) {
        return roomService.updateRoom(roomDto,id);
    }

    @Override
    public void deleteRoom(Long id) {
        roomService.deleteRoom(id);
    }
}
