package com.akash.creational.simple_factory;

class DoorFactory {

	public static Door makeDoor (int width, int height) {
		return new WoodenDoor(width, height);
	}

}

