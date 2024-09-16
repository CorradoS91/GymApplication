package it.corrado.GymApplication.service;

import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.model.Room;
import jakarta.persistence.Column;

import java.util.List;

public interface RoomService {
    RoomDto createRoom(RoomDto roomDto);
    RoomDto getRoomById(Long id);
    List<RoomDto> getRoomByName(String name);

    RoomDto updateRoom(RoomDto roomDto, Long id);
    List<RoomDto> getAllRooms();
    void deleteRoom(Long id);
}
