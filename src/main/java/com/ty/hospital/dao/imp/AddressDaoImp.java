package com.ty.hospital.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dao.AddressDao;
import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;

public class AddressDaoImp implements AddressDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	@Override
	public Address saveAddress(Address address,int bid) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		Branch branch=branchDaoImp.getBranchById(bid);
		address.setBranch(branch);
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return address;
	}

	@Override
	public Address getBranchAddressById(int id) {
		return entityManager.find(Address.class, id);
	}

	@Override
	public Address updateAddress(Address address, int id) {
		Address  address1=entityManager.find(Address.class, id);
		address1.setState(address.getState());
		address1.setStreet(address.getStreet());
		address1.setCountry(address.getCountry());
		address1.setPincode(address.getPincode());
		entityTransaction.begin();
		entityManager.merge(address1);
		entityTransaction.commit();
		return address1;
	}

	@Override
	public boolean deleteAddress(int id) {
		Address  address1=entityManager.find(Address.class, id);
		entityTransaction.begin();
		if(address1 != null) {
			entityManager.remove(address1);
			entityTransaction.commit();
			return true;
		}
		else
			return false;
	}

}
