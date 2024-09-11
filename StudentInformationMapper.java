package com.mapper;

import javax.servlet.http.HttpServletRequest;


import com.dto.StudentInformation;

public class StudentInformationMapper {
	public StudentInformation mapStudentInformationMapper(HttpServletRequest request)
	{
		StudentInformation studentInformationDetail = new StudentInformation();
		studentInformationDetail.setStudentname(request.getParameter("studentname"));
		
		studentInformationDetail.setstudentRoomNumber(request.getParameter("studentRoomNo"));
		
		return studentInformationDetail;
	}

	

	
}
