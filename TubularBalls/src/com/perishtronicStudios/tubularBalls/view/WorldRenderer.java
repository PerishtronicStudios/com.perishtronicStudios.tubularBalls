package com.perishtronicStudios.tubularBalls.view;



import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.perishtronicStudios.tubularBalls.model.Rail;
import com.perishtronicStudios.tubularBalls.model.TB;
import com.perishtronicStudios.tubularBalls.model.World;

public class WorldRenderer {
	private static final float CAMERA_WIDTH = 10f;
	private static final float CAMERA_HEIGHT = 7f;
	private static final float RUNNING_FRAME_DURATION = 0.06f;

	private World world;
	private OrthographicCamera cam;

	/** for debug rendering **/
	ShapeRenderer shapeRenderer = new ShapeRenderer();

	/** Textures **/


	/** Animations **/


	private SpriteBatch spriteBatch;
	private boolean debug = false;
	private int width;
	private int height;
	private float ppuX;	// pixels per unit on the X axis
	private float ppuY;	// pixels per unit on the Y axis

	public void setSize (int w, int h) {
		this.width = w;
		this.height = h;
		ppuX = (float)width / CAMERA_WIDTH;
		ppuY = (float)height / CAMERA_HEIGHT;
	}
	public boolean isDebug() {
		return debug;
	}
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public WorldRenderer(World world, boolean debug) {
		this.world = world;
		this.cam = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
		this.cam.position.set(CAMERA_WIDTH / 2f, CAMERA_HEIGHT / 2f, 0);
		this.cam.update();
		this.debug = debug;
		spriteBatch = new SpriteBatch();

	}


	

	public void render() {
		
		if (debug)
			drawDebug();
		drawTB();
	}


	private void drawTB(){
		TB myBalls = world.getTb();
		Circle c1 = myBalls.getC1();
		Circle c2 = myBalls.getC2();
		
		shapeRenderer.begin(ShapeType.Line);
		shapeRenderer.setColor(new Color(0, 0, 1, 1));
		shapeRenderer.line(c1.x, c1.y,c2.x,c2.y);
		shapeRenderer.end();
		shapeRenderer.begin(ShapeType.Filled);
		shapeRenderer.setColor(new Color(0, 1, 1, 1));
		shapeRenderer.circle(c2.x,c2.y,c2.radius,1000);
		shapeRenderer.end();
		shapeRenderer.begin(ShapeType.Filled);
		shapeRenderer.setColor(new Color(1, 1, 0, 1));
		shapeRenderer.circle(c1.x,c1.y,c1.radius,1000);
		shapeRenderer.end();
		
		
		
	}
	

	private void drawDebug() {
		// render blocks
		shapeRenderer.setProjectionMatrix(cam.combined);
		shapeRenderer.begin(ShapeType.Filled);
		for (Rail rail: world.getDrawableRails((int)CAMERA_WIDTH, (int)CAMERA_HEIGHT)) {
			Rectangle rect = rail.getBounds();
			shapeRenderer.setColor(new Color(1, 0, 1, 1));
			shapeRenderer.rect(rect.x, rect.y, rect.width, rect.height);
			
		}
		shapeRenderer.end();
		


	}

	
}
