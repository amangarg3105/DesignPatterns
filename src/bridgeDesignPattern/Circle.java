package bridgeDesignPattern;

public class Circle extends Shape {

	public Circle(Color c) {
		super(c);
	}
	
	@Override
	public void applyColor() {
		System.out.print("Circle is filled with color ");
		c.applyColor();
	}
}
