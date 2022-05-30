package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.MedOrder;

public interface MedOrderDao {
	MedOrder saveMedOrder (MedOrder medOrder,int encounter_id );
	MedOrder getMedOrderById(int id);
	List<MedOrder> getMedOrderByEncounterId(int encounter_id);
	MedOrder updateMedOrder(MedOrder medOrder,int id) ;
	List<MedOrder> getMedOrderByPersonId(int person_id) ;
	boolean deleteMedOrder (int id);
	
}
