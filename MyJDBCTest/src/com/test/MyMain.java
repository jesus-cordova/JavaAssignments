package com.test;

public class MyMain {

	public static void main(String[] args) {

		DeptDAOImpl myDept = new DeptDAOImpl();

		for (Department el: myDept.getAllDepartments())
		{
			System.out.println(el.toString());
		}

		for (Department el: myDept.getDepartmentsByLocation("BOSTON"))
		{
			System.out.println(el.toString());
		}

	myDept.updateDepartmentById(30);
	}


}
