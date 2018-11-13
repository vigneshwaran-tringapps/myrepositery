package com.designpattern.behavioral.command;

public class Invoker  {
	ICommand on;
	ICommand off;
	ICommand genric;
	

	public Invoker(ICommand on,ICommand off){
		this.on = on;
		this.off = off;
	}
	
	public void setCommand(ICommand genric) {
		this.genric = genric;
		
	}
	private Invoker(){
		
	}
	

	
	public void clickOff() {
		off.execute();
	}

	public void clickOn() {
		on.execute();
		
	}

	public void buttonPressed() {
		genric.execute();		
	}

}
