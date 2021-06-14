package com.test;

public class Department {
	
		 int deptNo;
		 String dName;
		 String location;
		 
		 
		 public Department(int deptNo, String dName, String location)
		 {
			 this.deptNo = deptNo;
			 this.dName = dName;
			 this.location = location; 
			 
			 
		 }


		public int getDeptNo() {
			return deptNo;
		}


		public void setDeptNo(int deptNo) {
			this.deptNo = deptNo;
		}


		public String getdName() {
			return dName;
		}


		public void setdName(String dName) {
			this.dName = dName;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}
		 
		
		public String toString()
		{
			return deptNo + " " + dName + " " + location; 
		}
}
