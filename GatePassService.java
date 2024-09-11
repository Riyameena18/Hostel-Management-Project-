package com.service;

import java.util.List;

import com.dto.GatePassDetail;

import com.repository.GatePassRepository;


public class GatePassService {
	public int save(GatePassDetail gatepassDetail) {
		   GatePassRepository pass = new GatePassRepository();
		   return pass.save(gatepassDetail);   
	   }
	   public List<GatePassDetail> getAll() {
		   GatePassRepository pass = new GatePassRepository();
		  return pass.findAll();  
	   }
}
