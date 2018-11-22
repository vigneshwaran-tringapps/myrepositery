package com.designpattern.behavioral.interpreter;

public class InterpreterClient {
	

	public String convertToPostfix(String in) throws Exception {
		InterpreterClient interpreter = new InterpreterClient();

		  StackChar operationsStack  = new StackChar(in.length());
	        StringBuilder out = new StringBuilder();
	        String operations = "+-*/()";
	        char topSymbol = '+';
	        boolean empty;
	        for (int i = 0; i < in.length(); i++) {
	            if (operations.indexOf(in.charAt(i)) == -1)
	                out.append(in.charAt(i));
	            else {
	                while (!(empty = operationsStack.isEmpty())
	                        && interpreter.precedence(topSymbol = operationsStack.pop(), in.charAt(i)))
	                    out.append(topSymbol);
	                if (!empty) {
	                    operationsStack.push(topSymbol);
	                }
	                if (empty || in.charAt(i) != ')') {
	                    operationsStack.push(in.charAt(i));
	                }
	                else topSymbol = operationsStack.pop();
	            }
	        }
	        
	        while(!operationsStack.isEmpty())
	        out.append(operationsStack.pop());
	        
	        return out.toString();
	}

	private boolean precedence(char peek, char ch) {

		return prec(ch) <= prec(peek) ;
	}

	static int prec(char x)
	{
		if (x == '+' || x == '-')
			return 1;
		if (x == '*' || x == '/' || x == '%')
			return 2;
		return 0;
	}
	public int evaluate(String in) throws Exception {
		StackInt stkInt = new StackInt(in.length());
		String operations = "+-*/";
		
		for (int a,b,i = 0; i < in.length(); i++) {
			if (operations.indexOf(in.charAt(i)) == -1) {
                stkInt.push(in.charAt(i) - 48);
            }else {
            	b = stkInt.pop();
            	a = stkInt.pop();
            	
                if (in.charAt(i) == '+') {
                    a = a + b;
                }
                if (in.charAt(i) == '-') {
                    a = a - b;
                }
                if (in.charAt(i) == '*') {
                    a = a * b;
                }
                if (in.charAt(i) == '/') {
                    a = a / b;
                }
                stkInt.push(a);            }
            	
		}
		
		
		return stkInt.pop();
	}

}
