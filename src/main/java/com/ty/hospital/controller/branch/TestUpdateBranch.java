package com.ty.hospital.controller.branch;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.impl.BranchServiceImp;

public class TestUpdateBranch {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp=new BranchServiceImp();
		Branch branch=new Branch();
		branch.setName("Rajajinagar");
		branch.setPhone(9123478568l);
		branch.setEmail("ColRajai@gmail.com");
		
		Branch branch2=branchServiceImp.updateBranch(branch, 3);
		if(branch2 != null) {
			System.out.println("Branch Successfully Updated");
		}
		else {
			System.out.println("Sorry...........No branch");
		}
	}
}
