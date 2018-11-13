package com.designpattern.structural.test;

import org.junit.Test;

import com.designpattern.structural.facade.Amplifier;
import com.designpattern.structural.facade.CdPlayer;
import com.designpattern.structural.facade.DvdPlayer;
import com.designpattern.structural.facade.HomeTheaterFacade;
import com.designpattern.structural.facade.PopcornPopper;
import com.designpattern.structural.facade.Projector;
import com.designpattern.structural.facade.Screen;
import com.designpattern.structural.facade.TheaterLights;
import com.designpattern.structural.facade.Tuner;


public class FacadeTest {
	
	@Test
	public void test() {
		
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();	
	}

}
