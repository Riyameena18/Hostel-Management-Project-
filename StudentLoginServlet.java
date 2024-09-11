package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.factory.StudentFactory;
import com.mapper.StudentMapper;
import com.service.StudentService;

/**
 * Servlet implementation class StudentLoginServlet
 */
@WebServlet("/student.do")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 StudentMapper mapper = StudentFactory.createStudentMapperInstance();
	       StudentService service = StudentFactory.createStudentServiceInstance();
	        String message = service.validateUser(mapper.mapToStudentDetail(request)); 
	        
	    	if(message.contains("login successfully")) {
	    		RequestDispatcher rd1 = request.getRequestDispatcher("home.html");
	    		rd1.include(request, response);
	    		System.out.println("ritika");
	    		}
	    		else {
	    		RequestDispatcher rd2 = request.getRequestDispatcher("fail.html");
	    		rd2.include(request, response);
	    		System.out.println("nikita");
	    		}

	}
}

