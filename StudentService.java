package com.service;


import com.dto.StudentDetail;

import com.factory.StudentFactory;

import com.repository.StudentRepository;

public class StudentService {
	public String validateUser(StudentDetail studentDetail) {
		StudentRepository repository = StudentFactory.createStudentRepositoryInstance();
		StudentDetail result = repository.fetchLoginDetail(studentDetail);
		String message=" Invalid name and password";
		if(result!=null&&studentDetail.getPassword().equals(result.getPassword()))
		{
			message="login successfully";
		}
		return message;
	}

	public static StudentService createStudentServiceInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
