package com.ty.hospital.controller.address;

import com.ty.hospital.dto.Address;
import com.ty.hospital.service.impl.AddressServiceImp;

public class TestSaveAddress {
	public static void main(String[] args) {
		Address address=new Address();
		address.setCity("Mysore");
		address.setStreet("3rd Cross SB Layout");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode(560032);
		
		AddressServiceImp addressServiceImp=new AddressServiceImp();
		Address address2=addressServiceImp.saveAddress(address, 2);
		if(address2 != null) {
			System.out.println("Address Saved");
		}
		else {
			System.out.println("No Branch found to save address");
		}
	}
}
