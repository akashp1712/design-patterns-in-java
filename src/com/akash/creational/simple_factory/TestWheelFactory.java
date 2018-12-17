package com.akash.creational.simple_factory;

class TestWheelFactory {

	public static void main(String args[]) {

		Wheel carWheel = WheelFactory.makeWheel(15, 215);
		System.out.println(carWheel.getDiameter());
		System.out.println(carWheel.getWidth());

	}
}
