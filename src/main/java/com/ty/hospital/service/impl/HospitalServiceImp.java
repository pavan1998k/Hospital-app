package com.ty.hospital.service.impl;

import java.util.List;

import com.ty.hospital.dao.imp.HospitalDaoImp;
import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.HospitalService;

public class HospitalServiceImp implements HospitalService {
	HospitalDaoImp hospitalDaoImp=new HospitalDaoImp();
	public Hospital saveHospital(Hospital hospital) {
		return hospitalDaoImp.saveHospital(hospital);
	}

	public Hospital getHospitalById(int id) {
		return hospitalDaoImp.getHospitalById(id);
	}

	public Hospital getHospitalBranchesById(int hospital_id) {
		return hospitalDaoImp.getHospitalBranchesById(hospital_id);
	}

	public List<Hospital> getAllHospital() {
		return hospitalDaoImp.getAllHospital();
	}

	public Hospital updateHospital(Hospital hospital, int id) {
		return hospitalDaoImp.updateHospital(hospital, id);
	}

	public boolean deleteHospitalById(int id) {
		return hospitalDaoImp.deleteHospitalById(id);
	}

}
