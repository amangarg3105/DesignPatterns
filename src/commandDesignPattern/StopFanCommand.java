package commandDesignPattern;

public class StopFanCommand implements ICommand {

	Fan fan;

	public StopFanCommand(Fan fan) {
		
		this.fan = fan;
	}

	public void execute() {
		System.out.println("stopping Fan.");
		fan.stop();
	}

}
