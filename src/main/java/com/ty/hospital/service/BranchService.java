package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;

public interface BranchService {
	Branch saveBranch(Branch branch,int hospital_id);
	public Branch getBranchById(int id);
	public List<Branch> getAllBranch();
	Encounter getBranchEncounters(int bid);
	Branch updateBranch(Branch branch, int id);
	boolean deleteBranch(int id);
}
