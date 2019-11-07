package com.lti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CollegeDAO {
	DatabaseConnector db=new DatabaseConnector();
	
	
	//Register College
	public String addUser(College c)
	{
		String result="";
		
		try
		{
			String query="Insert into colleges values (?,?,?,?,?,?)";
			PreparedStatement pstmt=db.getPreparedStatement(query);
			pstmt.setInt(1,c.getCid());
			pstmt.setString(2, c.getCname());
			pstmt.setString(3,c.getCoursetype());
			pstmt.setString(4, c.getCity());
			pstmt.setInt(5, c.getFees());
			pstmt.setInt(6, c.getPincode());
			
			
			int i=pstmt.executeUpdate();
			
			if(i==1)
			{
				result=Results.SUCCESS;
			}
			else
			{
				result=Results.FAILURE;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result=Results.PROBLEM;
		}
		finally
		{
			db.closeConnection();
		}
		
		return result;
	}
	
	
	//Display all Colleges
	public ArrayList<College> showAllColleges()
	{
		ArrayList<College> list=new ArrayList<>();
		College c=null;
		
		
		try
		{
			String query="Select * from colleges";
			ResultSet rs=db.getResultSet(query);
			while(rs.next())
			{
				c=new College();
				c.setCid(rs.getInt("cid"));
				c.setCname(rs.getString("cname"));
				c.setCoursetype(rs.getString("coursetype"));
				c.setCity(rs.getString("city"));
				c.setFees(rs.getInt("fees"));
				c.setPincode(rs.getInt("pincode"));
				
				list.add(c);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		finally
		{
			db.closeConnection();
		}
		
		return  list;
	}
	
	
	//Delete College Record
	public String deleteUser(College c)
	{
		String result="";
		
		try
		{
			String query="delete from colleges where id=?";;
			PreparedStatement pstmt=db.getPreparedStatement(query);
			pstmt.setInt(1,c.getCid());
			
			int i=pstmt.executeUpdate();
			
			if(i==1)
			{
				result=Results.SUCCESS;
			}
			else
			{
				result=Results.FAILURE;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result=Results.PROBLEM;
		}
		finally
		{
			db.closeConnection();
		}
		
		return result;
	}
	
	
	
}
