package decoratorDesignPattern;


/*
 * In software engineering, decorator design pattern is used to add additional features or behaviors to a particular instance of a
   class, while not modifying the other instances of same class. Decorators provide a flexible alternative to sub-classing for 
   extending functionality. Please note that the description above implies that decorating an object changes its behavior but not
    its interface.

This pattern is very important to understand because once you know the techniques of decorating, you’ll be able to give your 
(or someone else’s) objects new responsibilities without making any code changes to the underlying classes. Interesting, isn’t it??
 Also this pattern is really useful and commonly faced java interview question on design patterns.
 
 Reference :
 https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
 */
public class DecoratorPatternTest {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar())); // new LuxuryCar(sportsCar);
		sportsLuxuryCar.assemble();

	}

}
