package com.ty.hospital.controller.hospital;

import com.ty.hospital.service.impl.HospitalServiceImp;

public class TestDeleteHospitalById {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
		boolean hospital=hospitalServiceImp.deleteHospitalById(2);
		if(hospital != false) {
			System.out.println("Deleted");
		}else {
			System.out.println("Id is not matching");
		}
	}
}
