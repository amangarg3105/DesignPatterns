package bridgeDesignPattern;


/*
 * It is used to decouple a class into two parts – abstraction and it’s implementation – so that both can evolve in future without 
 * affecting each other. It increases the loose coupling between class abstraction and it’s implementation.
 * reference Link :
 * https://refactoring.guru/design-patterns/bridge
 */
public class BridgePatternTest {

	public static void main(String[] args) {
	   Shape triangle = new Triangle(new Red());
	   triangle.applyColor();
	   
	   Shape circle = new Circle(new Red());
	   circle.applyColor();
	  
	}

}
