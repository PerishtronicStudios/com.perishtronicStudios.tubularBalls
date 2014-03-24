package com.perishtronicStudios.tubularBalls.model;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

public class TB {

	private Circle c1 = new Circle();
	private Circle c2 = new Circle();
	
	private float d;
	public static float R = 0.25f;
	
	public TB(Vector2 pos1,Vector2 pos2){
		c1.setPosition(pos1);
		c1.setRadius(TB.R);
		c2.setPosition(pos2);
		c2.setRadius(TB.R);
		d= pos1.dst(pos2);
	}

	public Circle getC1() {
		return c1;
	}

	public void setC1(Circle c1) {
		this.c1 = c1;
	}

	public Circle getC2() {
		return c2;
	}

	public void setC2(Circle c2) {
		this.c2 = c2;
	}

	public float getD() {
		return d;
	}

	public void setD(float d) {
		this.d = d;
	}
	
	
	
}
