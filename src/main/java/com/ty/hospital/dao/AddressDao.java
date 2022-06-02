package com.ty.hospital.dao;


import com.ty.hospital.dto.Address;

public interface AddressDao {
	Address saveAddress(Address address,int bid);
	Address getBranchAddressById(int id);
	Address updateAddress (Address address,int id);
	boolean deleteAddress (int id);
}
