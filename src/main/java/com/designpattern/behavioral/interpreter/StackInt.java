package com.designpattern.behavioral.interpreter;

public class StackInt implements Stack {
	
	int arr[] ;
	int position = -1;

	public StackInt(int i) {
		arr = new int[i];
	}

	@Override
	public <T> void push(T t) throws Exception {
if(isFull())
	throw new  Exception("overflow exception");
		
		arr[++position] = (int) t;
	}

	public int pop() throws Exception {
		
		if(isEmpty())
			throw new  Exception("underflow exception");
			
		
		return arr[position--];
	}

	@Override
	public boolean isFull() {
		return position == arr.length-1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return position == -1;
	}

}
