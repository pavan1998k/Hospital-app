package com.ty.hospital.controller.branch;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.impl.BranchServiceImp;

public class TestGetBranchById {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp=new BranchServiceImp();
		Branch branch=branchServiceImp.getBranchById(8);
		if(branch != null) {
			System.out.println("Branch Name: "+branch.getName());
			System.out.println("Branch Phone: "+branch.getPhone());
			System.out.println("Branch Email: "+branch.getEmail());
			System.out.println("*****************************************");
		}
		else {
			System.out.println("No Branch Found");
		}
	}
}
