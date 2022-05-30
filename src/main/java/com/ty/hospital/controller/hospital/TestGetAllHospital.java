package com.ty.hospital.controller.hospital;

import java.util.List;

import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.impl.HospitalServiceImp;

public class TestGetAllHospital {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
		List<Hospital> hospital=hospitalServiceImp.getAllHospital();
		if(hospital !=  null) {
			for (Hospital hospitals : hospital) {
				System.out.println("---------------Hospitals----------------");
				System.out.println("Hospital id: "+hospitals.getId());
				System.out.println("Hospital Name: "+hospitals.getName());
				System.out.println("Hospital Gst Number: "+hospitals.getGstNumber());
				System.out.println("***************************************************");
			}
		}
		else {
			System.out.println("There is no hospital");
		}
	}
}
