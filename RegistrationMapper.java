package com.mapper;

import javax.servlet.http.HttpServletRequest;

import com.dto.RegistrationDetail;



public class RegistrationMapper {
	public RegistrationDetail mapToRegistrationMapper(HttpServletRequest request)
	{
		RegistrationDetail registrationdetail = new RegistrationDetail();
		registrationdetail.setStudentName(request.getParameter("studentName"));
		registrationdetail.setStudentmobileno(request.getParameter("mobileNo"));
		registrationdetail.setfathername(request.getParameter("fatherName"));
		registrationdetail.setFathermobileno(request.getParameter("fatherNo"));
		registrationdetail.setBranch(request.getParameter("Branch"));
		registrationdetail.setYear(request.getParameter("Year"));
		registrationdetail.setStudentEmailid(request.getParameter("studentEmailId"));
		registrationdetail.setFatherEmailid(request.getParameter("fatherEmailId"));
		registrationdetail.setDateofbirth(request.getParameter("dateOfBirth"));
		registrationdetail.setAddress(request.getParameter("address"));
		
		registrationdetail.setPassword(request.getParameter("secret"));
		System.out.println(request.getParameter("secret"));
		return registrationdetail;
	}

}
