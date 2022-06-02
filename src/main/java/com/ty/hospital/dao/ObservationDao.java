package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Observation;

public interface ObservationDao {
	Observation createObservation (Observation observation,int encounter_id );
	Observation getObservationById(int id);
	List<Observation> getAllObservationByEncounterId(int eid);
	Observation updateObservation(Observation observation ,int id);
	boolean deleteObservation (int id) ;
}
