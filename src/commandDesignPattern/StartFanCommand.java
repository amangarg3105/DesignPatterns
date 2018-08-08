package commandDesignPattern;

public class StartFanCommand implements ICommand {

	Fan fan;

	public StartFanCommand(Fan fan) {

		this.fan = fan;
	}

	public void execute() {
		System.out.println("starting Fan.");
		fan.start();

	}

}
