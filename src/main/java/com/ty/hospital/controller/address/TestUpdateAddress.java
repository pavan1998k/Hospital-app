package com.ty.hospital.controller.address;

import com.ty.hospital.dto.Address;
import com.ty.hospital.service.impl.AddressServiceImp;

public class TestUpdateAddress {
	public static void main(String[] args) {
		Address address=new Address();
		address.setStreet("4th main Kl Layout");
		address.setCity("Mysore");
		address.setCountry("India");
		address.setState("Karnataka");
		address.setPincode(450056);
		
		AddressServiceImp addressServiceImp=new AddressServiceImp();
		Address address2=addressServiceImp.updateAddress(address, 1);
		if(address2 != null) {
			System.out.println("Address Successfully Updated");
		}
		else {
			System.out.println("Sorry.......No Address found to update");
		}
	}
}
