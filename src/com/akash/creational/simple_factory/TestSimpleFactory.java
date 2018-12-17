package com.akash.creational.simple_factory;

class TestSimpleFactory {

	public static void main(String args[]) {

		Door wd = DoorFactory.makeDoor(10,20);
		System.out.println(wd.getWidth());
		System.out.println(wd.getHeight());

	}
}

