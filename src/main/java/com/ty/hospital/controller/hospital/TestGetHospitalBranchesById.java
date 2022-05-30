package com.ty.hospital.controller.hospital;

import java.util.List;

import com.ty.hospital.dao.imp.HospitalDaoImp;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;

public class TestGetHospitalBranchesById {
	public static void main(String[] args) {
		HospitalDaoImp hospitalDaoImp =new HospitalDaoImp();
		Hospital hospital=hospitalDaoImp.getHospitalById(1);
		if(hospital != null) {
			List<Branch> branchs=hospital.getBranchs();
			System.out.println("--------------HOSPITAL--------------");
			System.out.println("Hospital Name: "+hospital.getName());
			System.out.println("Hospital Gst Number: "+hospital.getGstNumber());
			System.out.println("---------------------------------------------------");
			System.out.println("**********BRANCHES DETAILS***********");
			for (Branch branch : branchs) {
				System.out.println("Branch id: "+branch.getId());
				System.out.println("Branch Name: "+branch.getName());
				System.out.println("Branch Email: "+branch.getEmail());
				System.out.println("Branch Phone number: "+branch.getPhone());
				System.out.println();
			}
		}
	}
}
