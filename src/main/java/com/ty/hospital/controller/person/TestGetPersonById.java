package com.ty.hospital.controller.person;

import com.ty.hospital.dto.Person;
import com.ty.hospital.service.impl.PersonServiceImp;

public class TestGetPersonById {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp=new PersonServiceImp();
		Person person=personServiceImp.getPersonById(1);
		if(person!= null) {
			System.out.println("Name: "+person.getName());
			System.out.println("Age: "+person.getAge());
			System.out.println("Gender: "+person.getGender());
			System.out.println("Phone: "+person.getPhone());
			System.out.println("Email: "+person.getEmail());
		}
		else {
			System.out.println("Sorry...........No Person found");
		}
	}
}
