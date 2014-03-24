package com.perishtronicStudios.tubularBalls.model;



import com.badlogic.gdx.math.Vector2;

public class Level {
	private int width;
	private int height;
	private Rail[] rails;
	private int nRails=2;
	private static final int TOP=0;
	private static final int BOT=1;
		


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rail[] getRails() {
		return rails;
	}
	
	


	public void setRails(Rail[] rails) {
		this.rails = rails;
	}

	public Level() {
		loadDemoLevel();
	}
	


	private void loadDemoLevel() {
		width = 10;
		height = 7;
		rails = new Rail[nRails];
		for (int i = 0; i < nRails; i++) {
				rails[i]=null;
			}
		
		
		rails[TOP]=new Rail(new Vector2(0,7-Rail.HEIGHT),width);
		rails[BOT]=new Rail(new Vector2(0,0),width);
		
		

	}

	public int getnRails() {
		return nRails;
	}

	public void setnRails(int nRails) {
		this.nRails = nRails;
	}
}
