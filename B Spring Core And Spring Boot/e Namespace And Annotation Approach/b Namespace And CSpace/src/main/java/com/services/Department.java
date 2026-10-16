package com.services;

public class Department 
{
	private Integer deptId;
	
	private String deptName;
	
	public Department(Integer deptId,String deptName)
	{
		super();
		System.out.println("Department Bean Created ...");
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "Department [Department Id ="+deptId+" Department Name ="+deptName+"]";
	}
}
