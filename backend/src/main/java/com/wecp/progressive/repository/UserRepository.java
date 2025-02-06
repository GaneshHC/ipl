package com.wecp.progressive.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

    User findByUsername(String username);

    User findByEmail(String email);
=======

public interface UserRepository {
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
}
