package stateDesignPattern;


/*
 * State pattern is one of the behavioral design pattern. State design pattern is used when an Object changes its behavior based on
 *  its internal state.

If we have to change behavior of an object based on its state, we can have a state variable in the Object and use if-else condition
 block to perform different actions based on the state. State pattern is used to provide a systematic and lose-coupled way to 
 achieve this through Context and State implementations.
 Reference 
 https://www.geeksforgeeks.org/state-design-pattern/
 */
public class TestState {

	public static void main(String[] args) {
		AlertContext stateContext = new AlertContext();
		stateContext.setState(new Vibration());
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();        

	}

}
