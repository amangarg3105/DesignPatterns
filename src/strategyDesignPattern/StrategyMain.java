package strategyDesignPattern;

/*
 * Strategy design pattern is behavioral design pattern where we choose a specific implementation of algorithm or task in run time – 
 * out of multiple other implementations for same task.

The important point is that these implementations are interchangeable – based on task a implementation may be picked without 
disturbing the application workflow.

Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to 
be used as a parameter.
 */

public class StrategyMain {

	public static void main(String[] args) {
		 SocialMediaContext context = new SocialMediaContext();
		 
	        // Setting Facebook strategy.
	        context.setSocialmediaStrategy(new FacebookStrategy());
	        context.connect("Lokesh");
	 
	        System.out.println("====================");
	        
	        context.setSocialmediaStrategy(new GooglePlusStrategy());
	        context.connect("Lokesh");
	 
	        System.out.println("====================");

	}

}
