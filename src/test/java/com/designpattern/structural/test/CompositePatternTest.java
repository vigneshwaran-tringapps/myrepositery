package com.designpattern.structural.test;

import org.junit.Test;

import com.designpattern.structural.composite.CEO;
import com.designpattern.structural.composite.Clerk;
import com.designpattern.structural.composite.Employee;
import com.designpattern.structural.composite.HeadMarketing;
import com.designpattern.structural.composite.HeadSales;

public class CompositePatternTest {
	
	@Test
	public void test1() {
		Employee ceo = new CEO("vignesh","10LPA","IT");
		
		Employee headSales = new HeadSales("waran","8LPA","sales");
		
		Employee headMarketing = new HeadMarketing("vigneshwarn","8LPA","marketing");
		
		Employee clerk1 =new Clerk("vw","5LPA","sales");
		Employee clerk2 =new Clerk("vw","5LPA","sales");
		
		ceo.add(headSales);
		ceo.add(headMarketing);
		headSales.add(clerk1);
		headSales.add(clerk2);
		
	
		System.out.println(ceo.toString());
	      
	      for (Employee headEmployee : ceo.getSubordinates()) {
	         System.out.println(headEmployee);
	         
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }	
		

	}

}
