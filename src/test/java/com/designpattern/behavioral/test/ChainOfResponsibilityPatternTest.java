package com.designpattern.behavioral.test;

import org.junit.Test;

import com.designpattern.behavioral.chainofresponsibility.AbstractLogger;
import com.designpattern.behavioral.chainofresponsibility.ChainOfResponsibility;


public class ChainOfResponsibilityPatternTest {
	
	@Test
	public void test1() {
		
		
		 AbstractLogger loggerChain = ChainOfResponsibility.getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
		
	}

}
