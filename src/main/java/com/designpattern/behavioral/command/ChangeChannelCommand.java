package com.designpattern.behavioral.command;

public class ChangeChannelCommand implements ICommand {
	
	private Tv tv;
	
	public ChangeChannelCommand(Tv tv){
		this.tv = tv;
	}
	public void execute() {
tv.changeChannel();
	}

	public void unexecute() {
		// TODO Auto-generated method stub

	}

}
