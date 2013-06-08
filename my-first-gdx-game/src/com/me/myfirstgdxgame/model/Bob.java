package com.me.myfirstgdxgame.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bob {
	public enum State {
		IDLE, WALKING, JUMPING, DYPING
	}
	
	public static final float SPEED = 2f;  // unit per second
	public static final float JUMP_VELOCITY = 1f;
	public static final float SIZE = 0.5f; // half a unit
	
	Vector2 position = new Vector2();
	Vector2 acceleration = new Vector2();
	
	public Vector2 getAcceleration() {
		return acceleration;
	}

	Vector2 velocity = new Vector2();
	
	public Vector2 getVelocity() {
		return velocity;
	}

	Rectangle bounds = new Rectangle();
	State state = State.IDLE;
	boolean facingLeft = true;

	public Bob(Vector2 position){
		this.position = position;
		this.bounds.height = SIZE;
		this.bounds.width = SIZE;
	}

	public Vector2 getPosition() {
		return this.position;
	}

	public Rectangle getBounds() {
		return this.bounds;
	}

	public void update(float delta) {
		position.add(velocity.tmp().mul(delta));//cpy().//scl(delta));
	}

	public void setState(State newState) {
		this.state = newState;
	}

	public void setFacingLeft(boolean b) {
		// TODO Auto-generated method stub
	}
}
