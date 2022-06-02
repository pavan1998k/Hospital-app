package com.ty.hospital.service.impl;

import java.util.List;

import com.ty.hospital.dao.imp.MedOrderDaoImp;
import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.MedOrderService;


public class MedOrderServiceImp implements MedOrderService {
	MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();

	@Override
	public MedOrder saveMedOrder(MedOrder medOrder, int eid) {
		return medOrderDaoImp.saveMedOrder(medOrder, eid);
	}

	@Override
	public MedOrder getMedOrderById(int id) {
		return medOrderDaoImp.getMedOrderById(id);
	}

	@Override
	public List<MedOrder> getMedOrderByEncounterId(int eid) {
		return medOrderDaoImp.getMedOrderByEncounterId(eid);
	}

	@Override
	public List<MedOrder> getMedOrderByPersonId(int pid) {
		return medOrderDaoImp.getMedOrderByPersonId(pid);
	}

	@Override
	public MedOrder updateMedOrder(MedOrder medOrder) {
		return medOrderDaoImp.updateMedOrder(medOrder);
	}

	@Override
	public MedOrder deleteMedOrderById(int id) {
		return medOrderDaoImp.deleteMedOrderById(id);
	}
	
}
