package com.designpattern.behavioral.test;

import org.junit.Test;

import com.designpattern.behavioral.interpreter.InterpreterClient;
import com.designpattern.behavioral.interpreter.Stack;
import com.designpattern.behavioral.interpreter.StackChar;
import com.designpattern.behavioral.interpreter.StackInt;

public class InterpreterPatternTest {
	
	@Test
	public void test1() throws Exception {
		
		Stack stkInt = new StackChar(9);
		Stack stkChar = new StackInt(9);
		
		
		InterpreterClient  iClient = new InterpreterClient();
		String expression = "2+3*4-5+6";
		
		 String postfix = iClient.convertToPostfix(expression);
	        System.out.print( " -- " + postfix );
	        System.out.println( " -- " + iClient.evaluate( postfix ) );
	}

}
