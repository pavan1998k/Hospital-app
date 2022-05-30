package com.ty.hospital.controller.user;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.impl.UserServiceImp;

public class TestGetUserById {
	public static void main(String[] args) {
		UserServiceImp userServiceImp=new UserServiceImp();
		User user=userServiceImp.getUserById(1);
		if(user != null) {
			System.out.println("User Name: "+user.getName());
			System.out.println("User Email: "+user.getEmail());
			System.out.println("User Phone number: "+user.getPhone());
			System.out.println("User Role: "+user.getRole());
		}
		else {
			System.out.println("User Not exits");
		}
	}
}
