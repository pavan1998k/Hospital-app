package com.ty.hospital.controller.person;

import java.util.List;

import com.ty.hospital.dto.Person;
import com.ty.hospital.service.impl.PersonServiceImp;

public class TestGetAllPerson {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp=new PersonServiceImp();
		List<Person> person=personServiceImp.getAllPerson();
		for (Person persons : person) {
			System.out.println("------------PERSON DETAILS-----------------");
			System.out.println("Name: "+persons.getName());
			System.out.println("Age: "+persons.getAge());
			System.out.println("Gender: "+persons.getGender());
			System.out.println("Phone: "+persons.getPhone());
			System.out.println("Email: "+persons.getEmail());
		}
	}
}
