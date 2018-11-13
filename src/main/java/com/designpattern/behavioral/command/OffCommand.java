package com.designpattern.behavioral.command;

public class OffCommand implements ICommand {
	private Tv tv;
	
	public OffCommand(Tv tv) {
		this.tv = tv;
	}

	

	public void execute() {

		tv.offTV();
	}

	public void unexecute() {
tv.onTV();
	}

}
