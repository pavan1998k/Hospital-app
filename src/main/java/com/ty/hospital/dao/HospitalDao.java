package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Hospital;

public interface HospitalDao {
	public Hospital saveHospital(Hospital hospital);
	Hospital getHospitalById(int id);
	Hospital getHospitalBranchesById(int hospital_id);
	List<Hospital> getAllHospital(  );
	Hospital updateHospital(Hospital hospital ,int id);
	boolean deleteHospitalById(int id);
}
