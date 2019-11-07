package com.lti;

	import java.io.IOException;
	import java.util.ArrayList;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.College;
	import com.lti.CollegeDAO;
	
	@WebServlet("/FetchAllColleges")
	public class FetchAllColleges extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	  
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			CollegeDAO userDao=new CollegeDAO();
			ArrayList<College> list1=userDao.showAllColleges();
			
			HttpSession session=request.getSession();
			session.setAttribute("collegeList",list1);

			
			RequestDispatcher rd=request.getRequestDispatcher("/showAllColleges.jsp");
			rd.forward(request, response);
			
		}

	}

