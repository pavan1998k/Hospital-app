package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Person;

public interface PersonService {
	Person savePerson(Person person);
	Person getPersonById(int id);
	Person getPersonEncountersByPersonId(int person_id);
	List<Person> getAllPerson();
	Person updatePerson(Person person, int id);
	boolean deletePerson(int id);
}
