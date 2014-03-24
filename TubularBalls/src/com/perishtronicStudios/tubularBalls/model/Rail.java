package com.perishtronicStudios.tubularBalls.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Rail {

	
	public static final float HEIGHT = 0.5f;
	
	Vector2 	position = new Vector2();
	Rectangle 	bounds = new Rectangle();
	Vector2   size = new Vector2();
	
	public Rail(Vector2 pos,float width) {
		this.position = pos;
		this.size.set(width, Rail.HEIGHT);
	
		this.bounds.setX(pos.x);
		this.bounds.setY(pos.y);
		this.bounds.width = width;
		this.bounds.height = Rail.HEIGHT;
	}

	public Vector2 getPosition() {
		return position;
	}

	public Rectangle getBounds() {
		return bounds;
	}
	
	public Vector2 getSize(){
		return size;
}

	
	
}
