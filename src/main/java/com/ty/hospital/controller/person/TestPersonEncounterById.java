package com.ty.hospital.controller.person;

import java.util.List;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.impl.PersonServiceImp;

public class TestPersonEncounterById {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp=new PersonServiceImp();
		Person person=personServiceImp.getPersonEncountersByPersonId(3);
		if(person!= null) {
			List<Encounter> encounter=person.getEncounter();
			System.out.println("*************PERSON  DETAILS*****************");
			System.out.println("Name: "+person.getName());
			System.out.println("Age: "+person.getAge());
			System.out.println("Gender: "+person.getGender());
			System.out.println("Phone: "+person.getPhone());
			System.out.println("Email: "+person.getEmail());
			System.out.println("--------------ENCOUNTER DETAILS--------------");
			for (Encounter encounters : encounter) {
				System.out.println("Reason: "+encounters.getReason());
				System.out.println("Admitted Date and Time: "+encounters.getAdmit_date_time());
				System.out.println("Discharge Date and Time: "+encounters.getDischarge_date_time());
				System.out.println("Status: "+encounters.getStatus());
				System.out.println("*********************************************");
			}
		}
		else {
			System.out.println("No Person details found");
		}
	}
}
