package com.ty.hospital.controller.branch;

import com.ty.hospital.service.impl.BranchServiceImp;

public class TestDeleteBranchById {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp=new BranchServiceImp();
		boolean branch=branchServiceImp.deleteBranch(1);
		if(branch != false) {
			System.out.println("Successfully Deleted");
		}
		else {
			System.out.println("Sorry.......No branch");
		}
	}
}
