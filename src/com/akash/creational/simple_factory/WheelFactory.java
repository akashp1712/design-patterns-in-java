package com.akash.creational.simple_factory;

class WheelFactory {

	public static Wheel makeWheel (float diameter, float width) {
		return new CarWheel(diameter, width);
	}

}
