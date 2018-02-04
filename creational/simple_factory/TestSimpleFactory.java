class TestSimpleFactory {

	public static void main(String args[]) {

		Door wd = DoorFactory.makeDoor(10,20);
		System.out.println(wd.getWidth());
		System.out.println(wd.getHeight());

	}
}

class TestWheelFactory {

	public static void main(String args[]) {

		Wheel carWheel = WheelFactory.makeWheel(15, 215);
		System.out.println(carWheel.getDiameter());
		System.out.println(carWheel.getWidth());

	}
}
