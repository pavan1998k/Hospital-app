package com.ty.hospital.controller.user;

import java.util.List;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.impl.UserServiceImp;

public class TestGetAllUser {
	public static void main(String[] args) {
		UserServiceImp userServiceImp=new UserServiceImp();
		List<User> user=userServiceImp.getAllUser();
		if(user != null) {
			for (User users : user) {
				System.out.println("User Name: "+users.getName());
				System.out.println("User Email: "+users.getEmail());
				System.out.println("User Phone number: "+users.getPhone());
				System.out.println("User Role: "+users.getRole());
				System.out.println("************************************************");
			}
		}
	}
}
