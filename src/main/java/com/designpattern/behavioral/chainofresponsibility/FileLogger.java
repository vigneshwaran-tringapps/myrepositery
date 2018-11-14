package com.designpattern.behavioral.chainofresponsibility;

public class FileLogger extends AbstractLogger {

	int level;

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
	      System.out.println("File::Logger: " + message);

	}

}
