package com.designpattern.structural.test;

import org.junit.Test;

import com.designpattern.structural.proxy.Image;
import com.designpattern.structural.proxy.ProxyImage;

public class ProxyPatternTest {
	
	@Test
	public void test1() {
		
		Image proxyImage = new ProxyImage("test_10mb.jpg");
		
		proxyImage.display();
		
		proxyImage.display();

	}

}
