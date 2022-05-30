package com.ty.hospital.controller.user;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.impl.UserServiceImp;

public class TestSaveUser {
	public static void main(String[] args) {
		User user=new User();
		user.setName("Chethan");
		user.setEmail("chethan@gmail.com");
		user.setPassword("chethu@74");
		user.setPhone(9945607906l);
		user.setRole("Admin");
		
		UserServiceImp userServiceImp=new UserServiceImp();
		userServiceImp.saveUser(user);
	}
}
