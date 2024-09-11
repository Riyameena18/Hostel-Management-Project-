package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dto.RoomAllocationDetail;

import com.mapper.RoomAllocationMapper;

import com.service.RoomAllocationService;


/**
 * Servlet implementation class RoomAllocationServlet
 */
@WebServlet("/allocate.do")
public class RoomAllocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomAllocationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
		RoomAllocationMapper allocationMapper = new RoomAllocationMapper();
		RoomAllocationDetail allocationDetail = allocationMapper.mapToRoomAllocationMapper(request);
		RoomAllocationService allocationService = new RoomAllocationService();
		int count = allocationService.save(allocationDetail);
		
	    RequestDispatcher rd= request.getRequestDispatcher("success.html");
	    rd.forward(request, response);
	}
}
