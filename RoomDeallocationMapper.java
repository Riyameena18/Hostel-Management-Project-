package com.mapper;

import javax.servlet.http.HttpServletRequest;

import com.dto.RoomDeallocationDetail;


public class RoomDeallocationMapper {
	public RoomDeallocationDetail mapToRoomDeallocationMapper(HttpServletRequest request)
	{
		RoomDeallocationDetail roomDeallocationDetail = new RoomDeallocationDetail();
		roomDeallocationDetail.setStudentName(request.getParameter("studentName"));
		roomDeallocationDetail.setmobileNo(request.getParameter("mobileNo"));
		roomDeallocationDetail.setroomnumber(request.getParameter("roomNumber"));
		roomDeallocationDetail.setcheckoutdate(request.getParameter("checkOutDate"));

		return roomDeallocationDetail;
	}
}
