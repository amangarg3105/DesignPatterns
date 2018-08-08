package templateMethodDesignPattern;

/*
 * Template method design pattern is widely accepted behavioral design pattern to enforce some sort of algorithm (fixed set of steps) in the context of programming.
It defines the sequential steps to execute a multi-step algorithm and optionally can provide a default implementation as well (based on requirements).

Have you faced any situation in your programming where you need to define a set of specific steps every time with a fixed order so that this can be enforced by implementation
 classes? If so, then template method pattern is the solution for you which can be used to enforce these steps (algorithm) in an orderly manner.
 
 Let’s understand this pattern with an example, suppose we want to provide an algorithm to build a house. The steps need to be performed to build a house are – building 
 foundation, building pillars, building walls and windows. The important point is that the we can’t change the order of execution because we can’t build windows before 
 building the foundation. So in this case we can create a template method that will use different methods to build the house.

Now building the foundation for a house is same for all type of houses, whether its a wooden house or a glass house. So we can provide base implementation for this, 
if subclasses want to override this method, they can but mostly it’s common for all the types of houses
 */

public class HouseClientTest {

	public static void main(String[] args) {
HouseTemplate houseType = new WoddenHouse();
		
		//using template method
		houseType.buildHouse();
		System.out.println("************");
		
		houseType = new GlassHouse();
		
		
		
		
		
		houseType.buildHouse();
	}

}
