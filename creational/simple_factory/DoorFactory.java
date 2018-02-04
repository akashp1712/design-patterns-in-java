class DoorFactory {

	public static Door makeDoor (int width, int height) {
		return new WoodenDoor(width, height);
	}

}

class WheelFactory {

	public static Wheel makeWheel (float diameter, float width) {
		return new CarWheel(diameter, width);
	}

}