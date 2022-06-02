package com.ty.hospital.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dao.HospitalDao;
import com.ty.hospital.dto.Hospital;

public class HospitalDaoImp implements HospitalDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}

	public Hospital getHospitalById(int id) {
		return entityManager.find(Hospital.class, id);
	}

	public Hospital getHospitalBranchesById(int hospital_id) {
		return entityManager.find(Hospital.class, hospital_id);
	}

	public List<Hospital> getAllHospital() {
		String sql="SELECT h FROM Hospital h";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
	}

	public Hospital updateHospital(Hospital hospital, int id) {
		Hospital hospital1=entityManager.find(Hospital.class, id);
		System.out.println(hospital1);
		hospital1.setGstNumber(hospital.getGstNumber());
		entityTransaction.begin();
		entityManager.merge(hospital1);
		entityTransaction.commit();
		return hospital1;
	}

	public boolean deleteHospitalById(int id) {
		Hospital hospital=entityManager.find(Hospital.class, id);
		entityTransaction.begin();
		if(hospital != null) {
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		}
		else
			return false;
	}
}
