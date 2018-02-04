public abstract class Wheel {

	public abstract float getDiameter();
	public abstract float getWidth();

	@Override
	public String toString(){
		return "Diameter = " + String.valueOf(this.getDiameter()) + ", Width = " + String.valueOf(this.getWidth());
	}
}