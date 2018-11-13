package com.designpattern.behavioral.command;

public class OnCommand implements ICommand {
	private Tv tv;
	
	public OnCommand(Tv tv) {
		this.tv = tv;
	}

	public void execute() {
tv.onTV();
	}

	public void unexecute() {
tv.offTV();
	}

}
