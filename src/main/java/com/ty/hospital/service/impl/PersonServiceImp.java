package com.ty.hospital.service.impl;

import java.util.List;

import com.ty.hospital.dao.imp.PersonDaoImp;
import com.ty.hospital.dto.Person;
import com.ty.hospital.service.PersonService;

public class PersonServiceImp implements PersonService{
	PersonDaoImp personDaoImp=new PersonDaoImp();

	@Override
	public Person savePerson(Person person) {
		return personDaoImp.savePerson(person);
	}

	@Override
	public Person getPersonById(int id) {
		return personDaoImp.getPersonById(id);
	}

	@Override
	public Person getPersonEncountersByPersonId(int person_id) {
		return personDaoImp.getPersonEncountersByPersonId(person_id);
	}

	@Override
	public List<Person> getAllPerson() {
		return personDaoImp.getAllPerson();
	}

	@Override
	public Person updatePerson(Person person, int id) {
		return personDaoImp.updatePerson(person, id);
	}

	@Override
	public boolean deletePerson(int id) {
		return personDaoImp.deletePerson(id);
	}

}
