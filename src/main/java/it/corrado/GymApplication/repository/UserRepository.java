package it.corrado.GymApplication.repository;

import it.corrado.GymApplication.dto.UserDto;
import it.corrado.GymApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByName(String name);
    List<User> findAllBySurname(String surname);
    User findByCode(String code);
    User findByPhone(String phone);
    User findByEmail(String email);
}
