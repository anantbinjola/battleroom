package com.payne.game;

import java.awt.Canvas;

import org.apache.log4j.Logger;

public class Game extends Canvas implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER=Logger.getLogger(Game.class);

	public void run(){
		
	}
	
	public void display(){
		LOGGER.info("hello everyone");
	}

	

}