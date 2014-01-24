package de.geometricol.rain.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	public boolean flipX;
	public boolean flipY;

	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles, false, false);
	public static Sprite voidSprite = new Sprite(16, 0x2184FF);
	
	public static Sprite playerDown = new Sprite(16, 2, 13, SpriteSheet.tiles, false, false);
	public static Sprite playerUp = new Sprite(16, 0, 13, SpriteSheet.tiles, false, false);
	public static Sprite playerRight = new Sprite(16, 1, 13, SpriteSheet.tiles, false, false);
	public static Sprite playerLeft = new Sprite(16, 1, 13, SpriteSheet.tiles, true, false);

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
