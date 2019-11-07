package com.lti;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/AddCollegeController")
public class AddCollegeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddCollegeController() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

		int cid=Integer.parseInt(request.getParameter("cid"));
		String cname=request.getParameter("cname");
		String coursetype=request.getParameter("coursetype");
		String city=request.getParameter("city");
		int fees=Integer.parseInt(request.getParameter("fees"));
		int pincode=Integer.parseInt(request.getParameter("pincode"));

		College c=new College();
		c.setCid(cid);
		c.setCname(cname);
		c.setCoursetype(coursetype);
		c.setCity(city);
		c.setFees(fees);
		c.setPincode(pincode);
		
		
		CollegeDAO collegeDao=new CollegeDAO();
		String result=collegeDao.addUser(c);
		
		if(result.equals(Results.SUCCESS))
		{
	
			RequestDispatcher rd=request.getRequestDispatcher("/addSuccess.jsp");
			rd.forward(request, response);
		}
		
	}

}
