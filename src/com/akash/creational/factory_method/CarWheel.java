package com.akash.creational.factory_method;

public class CarWheel extends Wheel {

	private float diameter;
	private float width;

	public CarWheel(float diameter, float width) {
		this.diameter = diameter;
		this.width = width;
	}


	@Override
	public float getDiameter() {
		return diameter;

	}

	@Override
	public float getWidth() {
		return width;
	}

}