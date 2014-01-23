package de.geometricol.rain.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;

	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 0x2184FF);
	
	public static Sprite playerDown = new Sprite(16, 2, 15, SpriteSheet.tiles);
	public static Sprite playerUp = new Sprite(16, 0, 15, SpriteSheet.tiles);
	public static Sprite playerLeft = new Sprite(16, 3, 15, SpriteSheet.tiles);
	public static Sprite playerRight = new Sprite(16, 1, 15, SpriteSheet.tiles);

	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
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