package com.lcwd.user.service.UserService.Service;

import java.util.List;

import com.lcwd.user.service.UserService.DTO.UserDTO;

public interface UserService {
	
	//create
	UserDTO createUser(UserDTO userdto);
	
	
	//update
	UserDTO updateUser(UserDTO userdto , String userId);
	
	
	//Delete
	void deletUser(String userId);
	
	
	//get single user
	UserDTO getSingleUser(String userId);
	
	
	//get all users
	List<UserDTO> getAllUser();
 	
	
	
	

}
