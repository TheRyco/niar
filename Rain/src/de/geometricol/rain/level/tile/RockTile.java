package de.geometricol.rain.level.tile;

import de.geometricol.rain.graphics.Screen;
import de.geometricol.rain.graphics.Sprite;

public class RockTile extends Tile{

	public RockTile(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
