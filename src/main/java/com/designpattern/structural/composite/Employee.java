package com.designpattern.structural.composite;

import java.util.LinkedList;
import java.util.List;

public abstract class Employee {
	
	
	protected String name;
	protected String salary;
	protected String dept;
	protected List<Employee> subordinates;

	public Employee(String name, String salary, String dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		subordinates = new LinkedList<Employee>();
	}
	
	public void add(Employee employee) {
		subordinates.add(employee);
		
	}
	
	public void remove(Employee employee) {
		subordinates.remove(employee);
	}
	
	 public List<Employee> getSubordinates(){
	     return subordinates;
	 }
	 @Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + ", subordinates=" + subordinates
					+ "]";
		}


}
