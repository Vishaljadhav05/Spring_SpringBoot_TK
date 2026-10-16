package com.services;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	private String city;
	
	public Employee(int id, String name,double salary, String city)
	{
		super();
		System.out.println("Employee Bean Created ...");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "Employee [Id : "+id+", Name : "+name+", Salary : "+salary+", City : "+city+"]";
	}
	
	public void empTask()
	{
		System.out.println("Employee pretend that he is busy but in reality, Not productive ");
	}
}
