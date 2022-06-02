package com.ty.hospital.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dao.PersonDao;
import com.ty.hospital.dto.Person;

public class PersonDaoImp implements PersonDao{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	@Override
	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}

	@Override
	public Person getPersonById(int id) {
		return entityManager.find(Person.class, id);
	}

	@Override
	public Person getPersonEncountersByPersonId(int person_id) {
		return entityManager.find(Person.class, person_id);
	}

	@Override
	public List<Person> getAllPerson() {
		Query query=entityManager.createQuery("SELECT p FROM Person p");
		return query.getResultList();
	}

	@Override
	public Person updatePerson(Person person, int id) {
		Person person2=entityManager.find(Person.class, id);
		person2.setName(person.getName());
		person2.setEmail(person.getEmail());
		person2.setAge(person.getAge());;
		person2.setGender(person.getGender());
		person2.setPhone(person.getPhone());
		entityTransaction.begin();
		entityManager.merge(person2);
		entityTransaction.commit();
		return person2;
	}

	@Override
	public boolean deletePerson(int id) {
		Person person=entityManager.find(Person.class, id);
		entityTransaction.begin();
		if(person != null) {
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
