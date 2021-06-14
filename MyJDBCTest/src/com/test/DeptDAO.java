package com.test;

import java.util.List;

public interface DeptDAO {
	  public List<Department> getAllDepartments();
	  public List<Department> getDepartmentsByLocation(String location);
	  public void updateDepartmentById(int depNo);
	  public void deleteDepartmentById(int depNo);
	  public void addEmployee(Department e);
}
