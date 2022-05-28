package com.ty.hospital.dao.imp;

import java.util.List;

import com.ty.hospital.dto.Observation;

public interface ObservationDao {
	Observation createObservation (Observation observation,int encounter_id );
	Observation getObservationById(int id);
	List<Observation> getObservationByEncounterId(int encounter_id);
	Observation updateObservation(Observation observation ,int id);
	boolean deleteObservation (int id) ;
}