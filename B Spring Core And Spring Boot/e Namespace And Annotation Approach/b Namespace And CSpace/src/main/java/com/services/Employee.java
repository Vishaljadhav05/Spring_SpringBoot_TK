package com.services;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	private String city;
	
	private Department department;
	
	public Employee()
	{
		super();
		System.out.println("Employee Bean Created ...");
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "Employee [Id = "+id+", Name = "+name+", Salary = "+salary+", City = "+city+", Department = "+department+"]";
	}
	
	public void empTask()
	{
		System.out.println("Employee pretend that he is busy but in reality, Not productive ");
	}
}
