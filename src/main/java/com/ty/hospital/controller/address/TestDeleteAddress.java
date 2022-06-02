package com.ty.hospital.controller.address;

import com.ty.hospital.service.impl.AddressServiceImp;

public class TestDeleteAddress {
	public static void main(String[] args) {
		AddressServiceImp addressServiceImp=new AddressServiceImp();
		boolean address=addressServiceImp.deleteAddress(1);
		if(address != false) {
			System.out.println("Successfully Deleted");
		}
		else {
			System.out.println("Address not found");
		}
	}
}
