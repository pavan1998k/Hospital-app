package com.ty.hospital.controller.branch;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.impl.BranchServiceImp;

public class TestGetAllBranch {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp=new BranchServiceImp();
		List<Branch> branch=branchServiceImp.getAllBranch();
		if(branch.size()>0) {

			for (Branch branchs : branch) {
				Hospital hospital=branchs.getHospital();
				System.out.println("Hospital Name: "+hospital.getName());
				System.out.println("---------------------------------------");
				System.out.println("Branch Name: "+branchs.getName());
				System.out.println("Branch Phone: "+branchs.getPhone());
				System.out.println("Branch Email: "+branchs.getEmail());
				System.out.println("***************************************");
			}
		}
		else {
			System.out.println("There is no branch");
		}
	}
}
