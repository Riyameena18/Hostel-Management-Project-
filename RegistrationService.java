package com.service;

import java.util.List;

import com.dto.RegistrationDetail;
import com.repository.RegistrationRepository;

public class RegistrationService {
	public int save(RegistrationDetail regDetail) {
		   RegistrationRepository repo = new RegistrationRepository();
		   return repo.save(regDetail);   
	   }
	   public List<RegistrationDetail> getAll() {
		   RegistrationRepository repo = new RegistrationRepository();
		  return repo.findAll();  
	   }
	}

