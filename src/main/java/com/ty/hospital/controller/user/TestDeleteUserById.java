package com.ty.hospital.controller.user;

import com.ty.hospital.service.impl.UserServiceImp;

public class TestDeleteUserById {
	public static void main(String[] args) {
		UserServiceImp userServiceImp=new UserServiceImp();
		userServiceImp.deleteUserById(4);
		
	}
}
