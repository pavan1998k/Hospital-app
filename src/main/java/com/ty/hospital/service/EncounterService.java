package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Encounter;

public interface EncounterService {
	public Encounter cretaeEncounter(int bid, int pid, Encounter encounter);

	public Encounter getEncounterById(int id);

	public List<Encounter> getEncounterByBranchesId(int bid);

	public List<Encounter> getEncounterByPersonId(int pid);

	public Encounter updateEncounter(Encounter encounter, int id);

	public boolean deleteEncounterById(int id);
}
