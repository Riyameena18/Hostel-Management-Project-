package com.mapper;

import javax.servlet.http.HttpServletRequest;

import com.dto.GatePassDetail;



public class GatePassMapper {
	public GatePassDetail gatePassMapper(HttpServletRequest request)
	{
		GatePassDetail gatepassDetail = new GatePassDetail();
		gatepassDetail.setStudentName(request.getParameter("studentName"));
		gatepassDetail.setmobileNo(request.getParameter("mobileNo"));
		
		gatepassDetail.setpurpose(request.getParameter("purpose"));
	    gatepassDetail.setDepaturetime(request.getParameter("depatureTime"));
	    gatepassDetail.setreturntime(request.getParameter("returnTime"));
        return  gatepassDetail;
	}


}
