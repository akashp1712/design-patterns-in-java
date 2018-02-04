public class WheelFactory {

	public static Wheel getWheel(String type, float diameter, float width) {

		if("CarWheel".equalsIgnoreCase(type))
			return new CarWheel(diameter, width);

		else if("BikeWheel".equalsIgnoreCase(type))
			return new BikeWheel(diameter, width);

		return null;
	}

}