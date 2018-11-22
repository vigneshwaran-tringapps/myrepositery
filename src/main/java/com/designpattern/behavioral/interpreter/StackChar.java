package com.designpattern.behavioral.interpreter;

public class StackChar implements Stack {

	private int position = -1;
	private char[] arr;

	public StackChar(int i) {
		arr = new char[i];
	}

	@Override
	public <T> void push(T t) throws Exception {
		if (isFull())
			throw new Exception("overflow exception");

		arr[++position] = (char) t;
	}

	public char pop() throws Exception {

		if (isEmpty())
			throw new Exception("underflow exception");

		return arr[position--];
	}

	@Override
	public boolean isFull() {
		return position == arr.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return position == -1;
	}

}
