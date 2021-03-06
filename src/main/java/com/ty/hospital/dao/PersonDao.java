package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Person;

public interface PersonDao {
	Person savePerson (Person person);
	Person getPersonById(int id);
	Person getPersonEncountersByPersonId(int person_id);
	List<Person> getAllPerson( );
	Person updatePerson (Person person,int id);
	boolean deletePerson (int id);
}
