package com.mapper;

import javax.servlet.http.HttpServletRequest;


import com.dto.StudentDetail;

public class StudentMapper {
	

	public StudentDetail mapToStudentDetail(HttpServletRequest request)
	{
		StudentDetail studentdetail = new StudentDetail();
		studentdetail.setUsername(request.getParameter("username"));
		studentdetail.setmobileNo(request.getParameter("mobileNo"));
		studentdetail.setPassword(request.getParameter("password"));
		return studentdetail;
	}
}
