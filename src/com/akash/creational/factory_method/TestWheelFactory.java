package com.akash.creational.factory_method;

class TestWheelFactory {
    public static void main(String args[]) {

        Wheel carWheel = WheelFactory.getWheel("Carwheel", 15, 215);
        Wheel bikeWheel = WheelFactory.getWheel("Bikewheel", 18, 245);

		System.out.println("Car wheel specifications:" + carWheel);
		System.out.println("Bike wheel specifications:" + bikeWheel);
    }
}