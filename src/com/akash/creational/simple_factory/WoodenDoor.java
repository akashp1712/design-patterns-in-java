package com.akash.creational.simple_factory;

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


