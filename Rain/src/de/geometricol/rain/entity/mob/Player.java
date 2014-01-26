package de.geometricol.rain.entity.mob;

import de.geometricol.rain.graphics.Screen;
import de.geometricol.rain.graphics.Sprite;
import de.geometricol.rain.input.Keyboard;

public class Player extends Mob {

	private Sprite sprite;
	private Keyboard input;
	private int anim = 0;
	private boolean walking = false;

	public Player(Keyboard input) {
		this.input = input;
		sprite = Sprite.playerUp;
	}

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}

	public void update() {
		int xa = 0, ya = 0;
		if(anim < 7500) anim++;
		else anim = 0;
		
		if (input.up) ya--;
		if (input.down) ya++;
		if (input.left) xa--;
		if (input.right) xa++;

		if (xa != 0 || ya != 0){
			move(xa, ya);
			walking = true;
		} else walking = false;
	}

	public void render(Screen screen) {
		int xx = x - 8;
		int yy = y - 8;

		if (this.dir == 0) {
			sprite = Sprite.playerUp;
			if(walking){
				if(anim % 20 > 10) sprite = Sprite.playerUp1;
				else sprite = Sprite.playerUp2;
			}
		}
		if (this.dir == 1) {
			sprite = Sprite.playerRight;
			if(walking){
				if(anim % 20 > 10) sprite = Sprite.playerRight1;
				else sprite = Sprite.playerRight2;
			}
		}
		if (this.dir == 2) {
			sprite = Sprite.playerDown;
			if(walking){
				if(anim % 20 > 10) sprite = Sprite.playerDown1;
				else sprite = Sprite.playerDown2;
			}
		}
		if (this.dir == 3) {
			sprite = Sprite.playerLeft;
			if(walking){
				if(anim % 20> 10) sprite = Sprite.playerLeft1;
				else sprite = Sprite.playerLeft2;
			}
		}
		
		
		screen.renderPlayer(xx, yy, sprite);
	}

}
