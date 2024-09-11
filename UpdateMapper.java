package com.mapper;

import javax.servlet.http.HttpServletRequest;

import com.dto.UpdateDetail;



public class UpdateMapper {
	public UpdateDetail mapToUpdateMapper(HttpServletRequest request)
	{
		UpdateDetail UpdateDetail = new UpdateDetail();
		UpdateDetail.setday(request.getParameter("day"));
		UpdateDetail.setmealtime(request.getParameter("mealtime"));
		UpdateDetail.setmealname(request.getParameter("mealname"));
		

		return UpdateDetail;
	}
}
