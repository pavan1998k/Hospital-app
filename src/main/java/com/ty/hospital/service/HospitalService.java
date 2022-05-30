package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Hospital;

public interface HospitalService {
	Hospital saveHospital(Hospital hospital);
	Hospital getHospitalById(int id);
	Hospital getHospitalBranchesById(int hospital_id);
	List<Hospital> getAllHospital();
	Hospital updateHospital(Hospital hospital, int id);
	boolean deleteHospitalById(int id);
}
