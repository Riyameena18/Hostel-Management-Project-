package com.mapper;

import javax.servlet.http.HttpServletRequest;

import com.dto.RoomAllocationDetail;

public class RoomAllocationMapper {
	public RoomAllocationDetail mapToRoomAllocationMapper(HttpServletRequest request)
	{
		RoomAllocationDetail roomAllocationDetail = new RoomAllocationDetail();
		
		roomAllocationDetail.setEnrollmentNo(request.getParameter("enrollmentNo"));
		roomAllocationDetail.setStudentName(request.getParameter("studentName"));
		roomAllocationDetail.setmobileNo(request.getParameter("mobileNo"));
		roomAllocationDetail.setroomnumber(request.getParameter("roomNumber"));
		roomAllocationDetail.setcheckindate(request.getParameter("checkInDate"));

		return roomAllocationDetail;
	}

	
}
