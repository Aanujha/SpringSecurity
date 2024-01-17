package com.example.swagger.repo;

import com.example.swagger.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {



//    Optional<User> findByEmail(String username);
    @Query("select u from User u where u.email = ?1")
    List<User> findByEmail(String email);
}
