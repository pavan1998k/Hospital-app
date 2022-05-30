package com.ty.hospital.controller.user;

import java.util.List;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.impl.UserServiceImp;

public class TestValidateUser {
	public static void main(String[] args) {
		UserServiceImp userServiceImp=new UserServiceImp();
		List<User> user=userServiceImp.validateUser("Prashu@gmail.com", "Prashu@74");
		if(user != null) {
			System.out.println("The User is Available");
		}
		else {
			System.out.println("please check the email or password........");
		}
	}
}
