package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.User;

public interface UserService {
	User saveUser(User user);
	List<User> validateUser(String email,String password);
	List<User> getAllUser( );                                
	User getUserById (int id);                       
	User updateUser(User user , int id);                    
	boolean deleteUserById(int id); 
}
