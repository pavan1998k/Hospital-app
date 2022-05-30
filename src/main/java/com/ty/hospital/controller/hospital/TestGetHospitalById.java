package com.ty.hospital.controller.hospital;

import com.ty.hospital.dao.imp.HospitalDaoImp;
import com.ty.hospital.dto.Hospital;

public class TestGetHospitalById {
	public static void main(String[] args) {
		HospitalDaoImp hospitalDaoImp =new HospitalDaoImp();
		Hospital hospital=hospitalDaoImp.getHospitalById(2);
		if(hospital != null) {
			System.out.println("--------------HOSPITAL--------------");
			System.out.println("Hospital Name: "+hospital.getName());
			System.out.println("Hospital Gst Number: "+hospital.getGstNumber());
		}
	}
	
}
