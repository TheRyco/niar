package de.geometricol.rain.level.tile;

import de.geometricol.rain.graphics.Screen;
import de.geometricol.rain.graphics.Sprite;

public class FlowerTile extends Tile{

	public FlowerTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
