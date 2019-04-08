package com.example.relationalDB.services;

public class EmployeeDto {

	 Long id;
     String empId;
     String empName;
     String empDesignation;
     String empDepartment;
	 Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", empId=" + empId + ", empName=" + empName + ", empDesignation="
				+ empDesignation + ", empDepartment=" + empDepartment + "]";
	}

}

   

