package bridgeDesignPattern;

public abstract class Shape {
	
	protected Color c;
	Shape(Color c) {
		this.c = c;
	}
	
	public abstract void applyColor();

}
