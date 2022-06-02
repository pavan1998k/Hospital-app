package com.ty.hospital.controller.encounter;

import com.ty.hospital.service.impl.EncounterServiceImp;

public class TestDeleteEncounterById {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImp = new EncounterServiceImp();
		boolean res = encounterServiceImp.deleteEncounterById(2);
		if (res != false) {
			System.out.println("Data is deleted");
		} else {
			System.out.println("Data is not found");
		}
	}
}
