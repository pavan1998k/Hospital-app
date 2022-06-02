package com.ty.hospital.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dao.MedOrderDao;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.MedOrder;

public class MedOrderDaoImp implements MedOrderDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	@Override
	public MedOrder saveMedOrder(MedOrder medOrder, int eid) {
		Encounter encounter = entityManager.find(Encounter.class, eid);
		medOrder.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
		return medOrder;
	}

	@Override
	public MedOrder getMedOrderById(int id) {
		return null;
	}

	@Override
	public List<MedOrder> getMedOrderByEncounterId(int eid) {
		return null;
	}

	@Override
	public List<MedOrder> getMedOrderByPersonId(int pid) {
		return null;
	}

	@Override
	public MedOrder updateMedOrder(MedOrder medOrder) {
		return null;
	}

	@Override
	public MedOrder deleteMedOrderById(int id) {
		return null;
	}

}
