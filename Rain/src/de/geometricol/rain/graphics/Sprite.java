package de.geometricol.rain.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	public boolean flipX;
	public boolean flipY;

	public static Sprite voidSprite = new Sprite(16, 0x2184FF);
	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles, false, false);
	public static Sprite flower = new Sprite(16, 1, 0, SpriteSheet.tiles, false, false);
	public static Sprite rock = new Sprite(16, 2, 0, SpriteSheet.tiles, false, false);
	
	
	public static Sprite playerDown = new Sprite(16, 2, 13, SpriteSheet.tiles, false, false);
	public static Sprite playerUp = new Sprite(16, 0, 13, SpriteSheet.tiles, false, false);
	public static Sprite playerRight = new Sprite(16, 1, 13, SpriteSheet.tiles, false, false);
	public static Sprite playerLeft = new Sprite(16, 1, 13, SpriteSheet.tiles, true, false);
	
	public static Sprite playerDown1 = new Sprite(16, 2, 14, SpriteSheet.tiles, false, false);
	public static Sprite playerUp1 = new Sprite(16, 0, 14, SpriteSheet.tiles, false, false);
	public static Sprite playerRight1 = new Sprite(16, 1, 14, SpriteSheet.tiles, false, false);
	public static Sprite playerLeft1 = new Sprite(16, 1, 14, SpriteSheet.tiles, true, false);
	
	public static Sprite playerDown2 = new Sprite(16, 2, 15, SpriteSheet.tiles, false, false);
	public static Sprite playerUp2 = new Sprite(16, 0, 15, SpriteSheet.tiles, false, false);
	public static Sprite playerRight2 = new Sprite(16, 1, 15, SpriteSheet.tiles, false, false);
	public static Sprite playerLeft2 = new Sprite(16, 1, 15, SpriteSheet.tiles, true, false);
	
	public static Sprite boyUp = new Sprite(16, 3, 0, SpriteSheet.boy, false, false);
	public static Sprite boyDown = new Sprite(16, 0, 0, SpriteSheet.boy, false, false);
	public static Sprite boyLeft = new Sprite(16, 1, 0, SpriteSheet.boy, false, false);
	public static Sprite boyRight = new Sprite(16, 2, 0, SpriteSheet.boy, false, false);
	
	public static Sprite boyUp1 = new Sprite(16, 3, 1, SpriteSheet.boy, false, false);
	public static Sprite boyDown1 = new Sprite(16, 0, 1, SpriteSheet.boy, false, false);
	public static Sprite boyLeft1 = new Sprite(16, 1, 1, SpriteSheet.boy, false, false);
	public static Sprite boyRight1 = new Sprite(16, 2, 1, SpriteSheet.boy, false, false);
	
	public static Sprite boyUp2 = new Sprite(16, 3, 0, SpriteSheet.boy, false, false);
	public static Sprite boyDown2 = new Sprite(16, 0, 2, SpriteSheet.boy, false, false);
	public static Sprite boyLeft2 = new Sprite(16, 1, 2, SpriteSheet.boy, false, false);
	public static Sprite boyRight2 = new Sprite(16, 2, 2, SpriteSheet.boy, false, false);
	
	public static Sprite boyUp3 = new Sprite(16, 3, 0, SpriteSheet.boy, false, false);
	public static Sprite boyDown3 = new Sprite(16, 0, 2, SpriteSheet.boy, false, false);
	public static Sprite boyLeft3 = new Sprite(16, 1, 2, SpriteSheet.boy, false, false);
	public static Sprite boyRight3 = new Sprite(16, 2, 2, SpriteSheet.boy, false, false);
	
	

	public Sprite(int size, int x, int y, SpriteSheet sheet, boolean flipX, boolean flipY) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		this.flipX = flipX;
		this.flipY = flipY;
		load();
	}
	
	public Sprite(int size, int colour){
		SIZE = size;
		pixels = new int[SIZE*SIZE];
		setColour(colour);
	}
	
	private void setColour(int colour){
		for (int i = 0; i < SIZE*SIZE; i++){
			pixels[i] = colour;
		}
	}

	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}

}
