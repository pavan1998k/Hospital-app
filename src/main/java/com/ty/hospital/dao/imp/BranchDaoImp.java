package com.ty.hospital.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.dao.BranchDao;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Hospital;

public class BranchDaoImp implements BranchDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	public Branch saveBranch(Branch branch, int hospital_id) {
		HospitalDaoImp hospitalDaoImp=new HospitalDaoImp();
		Hospital hospital=hospitalDaoImp.getHospitalById(hospital_id);
		branch.setHospital(hospital);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		return branch;
	}
	public Branch getBranchById(int id) {
		return entityManager.find(Branch.class, id);
	}
	public List<Branch> getAllBranch() {
		String sql="SELECT b FROM Branch b";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();
	}
	public Encounter getBranchEncounters(int bid) {
		// TODO Auto-generated method stub
		return null;
	}
	public Branch updateBranch(Branch branch, int id) {
		Branch branch2=entityManager.find(Branch.class, id);
		branch2.setName(branch.getName());
		branch2.setPhone(branch.getPhone());
		branch2.setEmail(branch.getEmail());
		entityTransaction.begin();
		entityManager.merge(branch2);
		entityTransaction.commit();
		return branch2;
	}
	public boolean deleteBranch(int id) {
		Branch branch=entityManager.find(Branch.class, id);
		entityTransaction.begin();
		if(branch != null) {
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		else 
			return false;
	}
}
