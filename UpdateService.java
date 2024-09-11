package com.service;

import java.util.List;

import com.dto.UpdateDetail;
import com.repository.UpdateRepository;




public class UpdateService {
	public int save(UpdateDetail UpdateDetail) {
		   UpdateRepository repo = new UpdateRepository();
		   return repo.save(UpdateDetail);   
	   }
	   public List<UpdateDetail> getAll() {
		   UpdateRepository repo = new UpdateRepository();
		  return repo.findAll();  
	   }
}
