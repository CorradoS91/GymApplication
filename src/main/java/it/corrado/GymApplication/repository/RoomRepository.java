package it.corrado.GymApplication.repository;

import it.corrado.GymApplication.dto.RoomDto;
import it.corrado.GymApplication.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    List<Room> findAllByName(String name);

}
