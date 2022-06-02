package com.ty.hospital.service.impl;

import java.util.List;

import com.ty.hospital.dao.imp.BranchDaoImp;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.service.BranchService;

public class BranchServiceImp implements BranchService{
	BranchDaoImp branchDaoImp=new BranchDaoImp();
	public Branch saveBranch(Branch branch, int hospital_id) {
		return branchDaoImp.saveBranch(branch, hospital_id);
	}
	public Branch getBranchById(int id) {
		return branchDaoImp.getBranchById(id);
	}
	public List<Branch> getAllBranch() {
		return branchDaoImp.getAllBranch();
	}
	public Encounter getBranchEncounters(int bid) {
		return branchDaoImp.getBranchEncounters(bid);
	}
	public Branch updateBranch(Branch branch, int id) {
		return branchDaoImp.updateBranch(branch, id);
	}
	public boolean deleteBranch(int id) {
		return branchDaoImp.deleteBranch(id);
	}
}
