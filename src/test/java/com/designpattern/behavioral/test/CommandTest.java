package com.designpattern.behavioral.test;

import org.junit.Test;

import com.designpattern.behavioral.command.ChangeChannelCommand;
import com.designpattern.behavioral.command.ICommand;
import com.designpattern.behavioral.command.OffCommand;
import com.designpattern.behavioral.command.OnCommand;
import com.designpattern.behavioral.command.Invoker;
import com.designpattern.behavioral.command.Tv;

public class CommandTest {
	
	@Test
	public void test() {
		
		ICommand on = new OnCommand(new Tv());
		
		ICommand off = new OffCommand(new Tv());
		
		Invoker invoke = new Invoker(on,off);
		
		
		invoke.clickOn();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		invoke.clickOff();
		
		ICommand changeChannel = new ChangeChannelCommand(new Tv());

		
		invoke.setCommand(changeChannel);
		invoke.buttonPressed();
	}

}
