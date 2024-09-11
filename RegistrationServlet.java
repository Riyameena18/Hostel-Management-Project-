package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.RegistrationDetail;
import com.mapper.RegistrationMapper;
import com.service.RegistrationService;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register.do")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside registration servlet");
		RegistrationMapper regMapper = new RegistrationMapper();
		RegistrationDetail regDetail = regMapper.mapToRegistrationMapper(request);
		RegistrationService service = new RegistrationService();
		int count = service.save(regDetail);
		if(count>0) {
	    RequestDispatcher rd= request.getRequestDispatcher("success.html");
	    rd.forward(request, response);}
		else {
			 RequestDispatcher rd= request.getRequestDispatcher("fail.html");
			    rd.forward(request, response);}
		}
	}

	

