package de.geometricol.rain.entity.mob;

import de.geometricol.rain.entity.Entity;
import de.geometricol.rain.graphics.Sprite;

public abstract class Mob extends Entity {

	protected int dir = 0;
	protected boolean moving = false;

	public void move(int xa, int ya) {
		if(xa > 0) dir = 1;
		if(xa < 0) dir = 3;
		if(ya > 0) dir = 2;
		if(ya < 0) dir = 0;
		
		
		if(!collision()){
			x += xa;
			y += ya;
		}
	}

	public void update() {
	}

	public boolean collision() {
		return false;
	}

	public void render() {
	}

}
