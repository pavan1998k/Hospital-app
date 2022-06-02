package com.ty.hospital.controller.person;

import com.ty.hospital.dto.Person;
import com.ty.hospital.service.impl.PersonServiceImp;

public class TestUpdatePerson {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp=new PersonServiceImp();
		Person person=new Person();
		person.setName("Ramesh");
		person.setPhone(9972863868l);
		person.setGender("Male");
		person.setAge(24);
		person.setEmail("ramesh@gmail.com");
		
		Person persons=personServiceImp.updatePerson(person, 3);
		if(persons != null) {
			System.out.println("Successfully Updated");
		}
		else {
			System.out.println("Sorry......There is no person to update");
		}
	}
	
}
