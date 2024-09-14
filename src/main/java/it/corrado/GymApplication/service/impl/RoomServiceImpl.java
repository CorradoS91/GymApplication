package it.corrado.GymApplication.service.impl;

import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.mapper.RoomMapper;
import it.corrado.GymApplication.model.Room;
import it.corrado.GymApplication.repository.RoomRepository;
import it.corrado.GymApplication.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {
    @Autowired
    private final RoomRepository roomRepository;
    @Autowired
    private final RoomMapper roomMapper;
    @Override
    public RoomDto createRoom(RoomDto roomDto) {
        Room room = roomMapper.roomDtoToRoom(roomDto);
        roomRepository.save(room);
        return roomDto;
    }

    @Override
    public RoomDto getRoomById(Long id) {
        Room room = roomRepository.findById(id).orElseThrow();
        return roomMapper.roomToRoomDto(room);
    }

    @Override
    public RoomDto getRoomByName(String name) {
        return null;
    }

    @Override
    public RoomDto getCurrentUsers(RoomDto roomDto) {
        return null;
    }

    @Override
    public RoomDto getRoomCapacity(RoomDto roomDto) {
        return null;
    }

    @Override
    public RoomDto getRoomStateUsers(RoomDto roomDto) {
        return null;
    }

    @Override
    public RoomDto updateRoom(RoomDto roomDto, Long id) {
        Room room = roomRepository.findById(id).orElseThrow();
        roomMapper.updateRoom(roomDto,room);
        roomRepository.save(room);
        return roomDto;
    }

    @Override
    public List<RoomDto> getAllRooms() {
        return List.of();
    }

    @Override
    public void deleteRoom(Long id) {
        Room room = roomRepository.findById(id).orElseThrow();
        roomRepository.delete(room);
    }
}
