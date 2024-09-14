package it.corrado.GymApplication.mapper;

import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.model.Room;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RoomMapper {
    RoomDto roomToRoomDto(Room room);
    Room roomDtoToRoom(RoomDto roomDto);
    void updateRoom(RoomDto roomDto, @MappingTarget Room room);
}
