package com.ty.hospital.service;

import com.ty.hospital.dto.Address;

public interface AddressService {
	Address saveAddress(Address address,int bid);
	Address getBranchAddressById(int id);
	Address updateAddress(Address address, int id);
	boolean deleteAddress(int id);
}
