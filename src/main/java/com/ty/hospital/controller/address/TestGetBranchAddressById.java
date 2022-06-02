package com.ty.hospital.controller.address;

import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.impl.AddressServiceImp;

public class TestGetBranchAddressById {
	public static void main(String[] args) {
		AddressServiceImp addressServiceImp=new AddressServiceImp();
		Address address=addressServiceImp.getBranchAddressById(1);
		if(address != null) {
			Branch branch=address.getBranch();
			System.out.println("Branch Name: "+branch.getName());
			System.out.println("-------------------------------------");
			System.out.println("Street: "+address.getStreet());
			System.out.println("City: "+address.getCity());
			System.out.println("State: "+address.getState());
			System.out.println("Country: "+address.getCountry());
			System.out.println("Pin-Code: "+address.getPincode());
		}
	}
}
