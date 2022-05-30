package com.ty.hospital.controller.user;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.impl.UserServiceImp;

public class TestUpdateUserById {
	public static void main(String[] args) {
		UserServiceImp userServiceImp=new UserServiceImp();
		User user=new User();
		//user.setId(1);
		user.setPhone(9740869723l);
		userServiceImp.updateUser(user, 5);
	
	}
}
