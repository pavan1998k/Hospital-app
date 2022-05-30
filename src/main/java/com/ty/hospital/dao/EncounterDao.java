package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Encounter;

public interface EncounterDao {
	Encounter createEncounter (int branch_id,int person_id,Encounter Encounter);
	Encounter getEncounterById(int id);                                                                                 
	List<Encounter> getEncountersByBranchId(int branch_id);
	List<Encounter> getEncountersByPersonId(int person_id) ;
	Encounter updateEncounter (Encounter encounter ,int id);
	boolean deleteEncounter (int id) ;
}
