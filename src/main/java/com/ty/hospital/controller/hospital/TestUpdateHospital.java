package com.ty.hospital.controller.hospital;

import com.ty.hospital.dao.imp.HospitalDaoImp;
import com.ty.hospital.dto.Hospital;

public class TestUpdateHospital {
	public static void main(String[] args) {
		HospitalDaoImp hospitalDaoImp=new HospitalDaoImp();
		Hospital hospital=new Hospital();
		hospital.setId(2);
		hospital.setName("Columbia Hospital");
		hospital.setGstNumber("5348KA043454IND");
		hospitalDaoImp.updateHospital(hospital, 2);
	}
}
