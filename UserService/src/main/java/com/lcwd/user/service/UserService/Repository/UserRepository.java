package com.lcwd.user.service.UserService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.user.service.UserService.entities.UserEntities;

public interface UserRepository extends JpaRepository<UserEntities, String>{

}
