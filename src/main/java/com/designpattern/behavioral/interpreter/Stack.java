package com.designpattern.behavioral.interpreter;

public interface Stack {
	
	public <T> void push(T t) throws Exception;
	public boolean isFull() ;
	public boolean isEmpty();

}
