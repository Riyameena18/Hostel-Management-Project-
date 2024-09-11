package com.service;

import java.util.List;

import com.dto.StudentInformation;

import com.repository.StudentInformationRepository;

public class StudentInformationService {
	public int save(StudentInformation studentInformation) {
		  StudentInformationRepository repo = new StudentInformationRepository();
		   return repo.save(studentInformation);   
	   }
	   public List<StudentInformation> getAll() {
		  StudentInformationRepository repo = new StudentInformationRepository();
		  return repo.findAll();  
	   }
}
