package com.ty.hospital.controller.person;

import com.ty.hospital.service.impl.PersonServiceImp;

public class TestDeletePersonById {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp=new PersonServiceImp();
		boolean person=personServiceImp.deletePerson(3);
		if(person != false) {
			System.out.println("Successfully Deleted.......");
		}
		else {
			System.out.println("Sorry......No Person to Delete");
		}
	}
}
