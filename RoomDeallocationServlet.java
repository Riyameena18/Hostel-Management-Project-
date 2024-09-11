package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.RoomAllocationDetail;
import com.dto.RoomDeallocationDetail;
import com.mapper.RoomAllocationMapper;
import com.mapper.RoomDeallocationMapper;
import com.service.RoomAllocationService;
import com.service.RoomDeallocationService;

/**
 * Servlet implementation class RoomDeallocationServlet
 */
@WebServlet("/deallocation.do")
public class RoomDeallocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomDeallocationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("enrollmentNo"));
		RoomAllocationService allocationService = new RoomAllocationService();
		int count = allocationService.delete(request.getParameter("enrollmentNo"));
		
	    RequestDispatcher rd= request.getRequestDispatcher("success.html");
	    rd.forward(request, response);
	}
}



