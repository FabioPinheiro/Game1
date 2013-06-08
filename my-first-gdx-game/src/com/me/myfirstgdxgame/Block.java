package com.me.myfirstgdxgame;

import com.badlogic.gdx.math.*;

public class Block {

	static final float SIZE = 1f;
	
	Vector2 	position = new Vector2();
	Rectangle 	bounds = new Rectangle();

	public Block(Vector2 position){
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
}
