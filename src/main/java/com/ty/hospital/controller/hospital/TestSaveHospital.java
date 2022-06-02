package com.ty.hospital.controller.hospital;

import java.util.ArrayList;
import java.util.List;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.impl.HospitalServiceImp;

public class TestSaveHospital {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("Baptist Hospital");
		hospital.setGstNumber("4321KA423568IND");
		
		Branch branch=new Branch();
		branch.setName("Hebbal");
		branch.setEmail("baptHeb@gmail.com");
		branch.setPhone(7856423896l);
		branch.setHospital(hospital);
		
		Branch branch1=new Branch();
		branch1.setName("Yelahanka");
		branch1.setEmail("baptYel@gmail.com");
		branch1.setPhone(8741258693l);
		branch1.setHospital(hospital);
		
		List<Branch> branchs=new ArrayList<Branch>();
		branchs.add(branch);
		branchs.add(branch1);
		hospital.setBranchs(branchs);
		
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
		hospitalServiceImp.saveHospital(hospital);
	}
}
