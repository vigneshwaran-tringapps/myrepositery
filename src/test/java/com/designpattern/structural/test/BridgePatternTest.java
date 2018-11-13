package com.designpattern.structural.test;

import org.junit.Test;

import com.designpattern.structural.bridge.AdvancedRemote;
import com.designpattern.structural.bridge.BasicRemote;
import com.designpattern.structural.bridge.Device;
import com.designpattern.structural.bridge.Radio;
import com.designpattern.structural.bridge.Remote;
import com.designpattern.structural.bridge.Tv;


public class BridgePatternTest {
	
	@Test
	public void test1() {
		
	Device tv = new Tv();
	Device radio = new Radio();
	
	Remote tvRemote = new BasicRemote(tv);
	tvRemote.power();

	BasicRemote radioRemote = new AdvancedRemote(radio);
	radioRemote.power();
	tv.printStatus();
	radio.printStatus();
	
	}

}
