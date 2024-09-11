package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dto.UpdateDetail;
import com.mapper.UpdateMapper;
import com.service.UpdateService;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UpdateMapper UpdateMapper = new UpdateMapper();
		UpdateDetail UpdateDetail = UpdateMapper.mapToUpdateMapper(request);
		UpdateService UpdateService = new UpdateService();
		int count = UpdateService.save(UpdateDetail);
		
	    RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/success.html");
	    rd.forward(request, response);
	}
	}


