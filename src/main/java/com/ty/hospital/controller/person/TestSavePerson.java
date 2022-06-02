package com.ty.hospital.controller.person;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.impl.PersonServiceImp;

public class TestSavePerson {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp=new PersonServiceImp();
		Person person=new Person();
		person.setName("Pavan");
		person.setPhone(7411920739l);
		person.setGender("Male");
		person.setAge(23);
		person.setEmail("pk@gmail.com");
		
		Encounter encounter=new Encounter();
		encounter.setReason("High Fever");
		encounter.setAdmit_date_time(LocalDateTime.of(2022,04,12,05,30));
		encounter.setDischarge_date_time(LocalDateTime.now());
		encounter.setStatus("Ok fine");
		encounter.setPerson(person);
		
		Encounter encounter1=new Encounter();
		encounter1.setReason("High Cold");
		encounter1.setAdmit_date_time(LocalDateTime.of(2022,04,18,05,30));
		encounter1.setDischarge_date_time(LocalDateTime.now());
		encounter1.setStatus("Ok fine");
		encounter1.setPerson(person);
		
		List<Encounter> encounters=new ArrayList<Encounter>();
		encounters.add(encounter);
		encounters.add(encounter1);
		
		person.setEncounter(encounters);
		
		Person person2=personServiceImp.savePerson(person);
		if(person2 != null) {
			System.out.println("Person Added Successfully");
		}
		else {
			System.out.println("Sorry.........Not added");
		}
	}
}
