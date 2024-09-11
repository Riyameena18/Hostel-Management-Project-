package com.factory;

import com.mapper.StudentMapper;
import com.repository.StudentRepository;
import com.service.StudentService;

public class StudentFactory {
	public static StudentMapper createStudentMapperInstance() {
		return new StudentMapper();
	   }
	   public static StudentService createStudentServiceInstance() {
		   return new StudentService();
	   }
	   public static StudentRepository createStudentRepositoryInstance() {
		   return new StudentRepository();
	   }

}
