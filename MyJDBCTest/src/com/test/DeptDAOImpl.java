package com.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeptDAOImpl implements DeptDAO {
	
	
	@Override
	public List<Department> getAllDepartments() {

	  ArrayList<Department> departments = new ArrayList<Department>();
			String QUERY = "select deptno,dname,loc from dept";
			try(Connection con = ConnectionUtil.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(QUERY))
			    {	
					while(rs.next()){
					int no = rs.getInt("deptno");
					String name = rs.getString("dname");
					String location = rs.getString("loc");
					Department currentDepartment  = new Department(no, name, location);
					departments.add(currentDepartment);
				}//try
			} catch (SQLException e) {e.printStackTrace(); }
		return departments;
	}

	@Override
	public List<Department> getDepartmentsByLocation(String searchLocation) {

	  ArrayList<Department> departments = new ArrayList<Department>();
			String QUERY = "select deptno,dname,loc from dept";
			try(Connection con = ConnectionUtil.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(QUERY))
			    {	
					while(rs.next()){
					int no = rs.getInt("deptno");
					String name = rs.getString("dname");
					String location = rs.getString("loc");
					if (searchLocation.equals(location))
					{
					Department currentDepartment  = new Department(no, name, location);
					departments.add(currentDepartment);
					}
				}//try
			} catch (SQLException e) {e.printStackTrace(); }
		return departments;
	}

	@Override
	public void updateDepartmentById(int depNo) {
		
		int row=0;
		String QUERY = "UPDATE dept SET dname='IT80' WHERE deptno=?";
		 try (Connection conn = ConnectionUtil.getConnection();
	             java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) 
	     {	preparedStatement.setInt(1, depNo);
	        row = preparedStatement.executeUpdate();
	         // rows affected
	         System.out.println(row);
	    	 
	     }catch( SQLException e)
	     {
	    	 System.out.println(" Row cannot be updated");
	     }
		 System.out.println("Row has sucessfully been updated");	
	}

	@Override
	public void deleteDepartmentById(int depNo) {
		
		int row=0;
		String QUERY = "Delete from dept where deptno = ?";
	     try (Connection conn = ConnectionUtil.getConnection();
	             java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) 
	     {		
	    	 preparedStatement.setInt(1, depNo);
	        row = preparedStatement.executeUpdate();
	    	 
	     }catch( SQLException e)
	     {
	    	 System.out.println(" Row cannot be deleted");
	     }
		 System.out.println("Row has sucessfully been removed");	
	}

	@Override
	public void addEmployee(Department dep) {
			String QUERY = "insert into dept values(80, 'Marketing', 'Reston')";
			try(Connection con = ConnectionUtil.getConnection();
					Statement stmt = con.createStatement())
				{ int result = stmt.executeUpdate(QUERY);
				System.out.println(" Result is :"+result);
			     if (result==1) 
			    	System.out.println(" Data Inserted");
			     else
			    	 System.out.println(" Issue in data insertion ");
			    } catch (SQLException e) {e.printStackTrace(); }
		
	}

}
