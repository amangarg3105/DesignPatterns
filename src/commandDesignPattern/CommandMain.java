package commandDesignPattern;

/*
 * In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object.

Command object passes the request to the appropriate method of Receiver to perform the specific action.

The client program create the receiver object and then attach it to the Command. Then it creates the invoker object and attach the
 command object to perform an action.

Now when client program executes the action, it’s processed based on the command and receiver object.
Suppose we need to build a remote control for home automation system which shall control different lights/electrical units of the 
home. A single button in remote may be able to perform same operation on similar devices e.g. a TV ON/OFF button can be used to 
turn ON/OFF different TV set in different rooms.

Here this remote will be a programmable remote and it would be used to turn on and off various lights/fan etc.
 */

public class CommandMain {

	public static void main(String[] args) {
	  Light light = new Light();
	  
	  InvokerRemote invokerRemote = new InvokerRemote();
	  
	  invokerRemote.setCommand(new TurnOnLightCommand(light));
	  invokerRemote.buttonPressed();
	  
	  Fan fan = new Fan();
	  
	  invokerRemote.setCommand(new StartFanCommand(fan));
	  invokerRemote.buttonPressed();

	}

}
