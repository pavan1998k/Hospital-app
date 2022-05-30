package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;

public interface AddressDao {
	Address saveAddress(Address address);
	Address getBranchAddressById(int id);
	Address updateAddress (Address address,int id);
	boolean deleteAddress (int id);
}
