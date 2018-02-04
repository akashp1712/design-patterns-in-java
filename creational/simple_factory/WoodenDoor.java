class WoodenDoor implements Door {

	protected int width;
	protected int height;

	public WoodenDoor(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}


class CarWheel implements Wheel {

	protected float diameter;
	protected float width;

	public CarWheel(float diameter, float width) {
		this.diameter = diameter;
		this.width = width;
	}

	public float getDiameter() {
		return diameter;
	}

	public float getWidth() {
		return width;
	}

}