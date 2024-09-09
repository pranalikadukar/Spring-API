package com.example.SpringApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringApi.User;
@Repository
public interface UserDao extends JpaRepository<User, Long>{

}
