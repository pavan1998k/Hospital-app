package com.ty.hospital.controller.hospital;

import java.util.ArrayList;
import java.util.List;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.impl.HospitalServiceImp;

public class TestSaveHospital {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("Columbia Hospital");
		hospital.setGstNumber("1324KA486532IND");
		
		Branch branch=new Branch();
		branch.setName("Basvangudi");
		branch.setEmail("colBas@gmail.com");
		branch.setPhone(7856423896l);
		
		Branch branch1=new Branch();
		branch1.setName("Vijayanagar");
		branch1.setEmail("colViji@gmail.com");
		branch1.setPhone(8741258693l);
		
		Branch branch2=new Branch();
		branch2.setName("Kengeri");
		branch2.setEmail("colKen@gmail.com");
		branch2.setPhone(8741258693l);
		
		List<Branch> branchs=new ArrayList<Branch>();
		branchs.add(branch);
		branchs.add(branch1);
		branchs.add(branch2);
		hospital.setBranchs(branchs);
		
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
		hospitalServiceImp.saveHospital(hospital);
	}
}
