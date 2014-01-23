package de.geometricol.rain.entity.mob;

import de.geometricol.rain.graphics.Screen;
import de.geometricol.rain.graphics.Sprite;
import de.geometricol.rain.input.Keyboard;

public class Player extends Mob {

	private Keyboard input;

	public Player(Keyboard input) {
		this.input = input;
	}

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}

	public void update() {
		int xa = 0, ya = 0;
		if (input.up) ya--;
		if (input.down) ya++;
		if (input.left) xa--;
		if (input.right) xa++;

		if (xa != 0 || ya != 0) move(xa, ya);
	}

	public void render(Screen screen) {
		int xx = x - 8;
		int yy = y - 8;

		if (this.dir == 0) screen.renderPlayer(xx, yy, Sprite.playerUp);
		if (this.dir == 1) screen.renderPlayer(xx, yy, Sprite.playerRight);
		if (this.dir == 2) screen.renderPlayer(xx, yy, Sprite.playerDown);
		if (this.dir == 3) screen.renderPlayer(xx, yy, Sprite.playerLeft);
	}

}
