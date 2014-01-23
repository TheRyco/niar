package de.geometricol.rain.entity;

import java.util.Random;

import de.geometricol.rain.graphics.Screen;
import de.geometricol.rain.level.Level;

public abstract class Entity {
	
	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update(){
		
	}
	
	public void render(Screen screen){
		
	}
	
	public void remove(){
		//TODO: remove from level
		removed = true;
	}

	public boolean isRemoved(){
		return removed;
	}
}
