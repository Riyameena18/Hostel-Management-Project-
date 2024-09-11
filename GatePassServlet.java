package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.GatePassDetail;

import com.mapper.GatePassMapper;

import com.service.GatePassService;


/**
 * Servlet implementation class GatePassServlet
 */
@WebServlet("/gatepass.do")
public class GatePassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GatePassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GatePassMapper gatePassMapper = new GatePassMapper();
		GatePassDetail gatePassDetail = gatePassMapper.gatePassMapper(request);
		GatePassService service = new GatePassService();
		int count = service.save(gatePassDetail);
		
	    RequestDispatcher rd= request.getRequestDispatcher("success.html");
	    rd.forward(request, response);
	}

	

}
