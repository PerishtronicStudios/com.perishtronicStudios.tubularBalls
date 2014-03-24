package com.perishtronicStudios.tubularBalls.model;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class World {

	/** A world has a level through which Bob needs to go through **/
	Level level;

	/** The collision boxes **/
	Array<Rectangle> collisionRects = new Array<Rectangle>();

	TB tb;
	
	// Getters -----------

	public Array<Rectangle> getCollisionRects() {
		return collisionRects;
	}

	public Level getLevel() {
		return level;
	}
	
	public TB getTb() {
		return tb;
	}

	public void setTb(TB tb) {
		this.tb = tb;
	}
	
	
	
	/** Return only the blocks that need to be drawn **/
	public List<Rail> getDrawableRails(int width, int height) {


		List<Rail> rails = new ArrayList<Rail>();
		Rail rail;
		for (int i = 0; i < level.getnRails(); i++) {
			
				rail= level.getRails()[i];
				if (rail!= null) {
					rails.add(rail);

				}
			}
			return rails;
		}

		// --------------------
		public World() {
			createDemoWorld();
		}

		private void createDemoWorld() {	
			level = new Level();
			tb = new TB(new Vector2(1,7-Rail.HEIGHT-TB.R),new Vector2(1,Rail.HEIGHT+TB.R));
		}
	}
