package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Hospital;

public interface BranchDao {
	Branch saveBranch(Branch branch,int hospital_id);
	Branch getBranchById(int id);
	Hospital getBranchHospitalById(int id);
	List<Branch> getAllBranch (  );
	List<Branch> getHospitalBranches(int hospital_id);
	Encounter getBranchEncounters(int bid);
	Branch updateBranch (Branch branch,int id);
	boolean deleteBranch (int id);
}
