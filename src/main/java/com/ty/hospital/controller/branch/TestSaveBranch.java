package com.ty.hospital.controller.branch;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.impl.BranchServiceImp;

public class TestSaveBranch {
	public static void main(String[] args) {
		Branch branch=new Branch();
		branch.setName("Ranjankunte");
		branch.setPhone(6854178935l);
		branch.setEmail("baptRajan@gmail.com");
		
		BranchServiceImp branchServiceImp=new BranchServiceImp();
		branchServiceImp.saveBranch(branch, 2);
	}
}
