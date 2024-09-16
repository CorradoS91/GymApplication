package it.corrado.GymApplication.service.impl;

import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.mapper.RoomMapper;
import it.corrado.GymApplication.model.Room;
import it.corrado.GymApplication.repository.RoomRepository;
import it.corrado.GymApplication.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<RoomDto> getRoomByName(String name) {
        List<Room> roomList = roomRepository.findAllByName(name);
        return roomMapper.listToDtoList(roomList);
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
        List<Room> roomList = roomRepository.findAll();
        return roomMapper.listToDtoList(roomList);
    }

    @Override
    public void deleteRoom(Long id) {
        Room room = roomRepository.findById(id).orElseThrow();
        roomRepository.delete(room);
    }
}
