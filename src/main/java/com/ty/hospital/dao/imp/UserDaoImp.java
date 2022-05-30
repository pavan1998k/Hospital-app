package com.ty.hospital.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dto.User;

public class UserDaoImp {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public List<User> validateUser(String email, String password) {
		String sql="SELECT u FROM User u WHERE email=?1 AND password=?2";
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		return query.getResultList();
	}

	public List<User> getAllUser() {
		String sql="SELECT u FROM User u";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
	}

	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}

	public User updateUser(User user, int id) {
		User user1=entityManager.find(User.class, id);
		user1.setPhone(user.getPhone());
		entityTransaction.begin();
		entityManager.merge(user1);
		entityTransaction.commit();
		return user1;
	}

	public boolean deleteUserById(int id) {
		User user1=entityManager.find(User.class, id);
		entityTransaction.begin();
		if(user1 != null) {
			entityManager.remove(user1);
			entityTransaction.commit();
			return true;
		}
		else 
			return true;
	}

}
