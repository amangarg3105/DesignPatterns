package stateDesignPattern;

public class AlertContext {
	
	MobileAlertState mobileAlertState;
	
	public void setState(MobileAlertState mobileAlertState) {
		this.mobileAlertState = mobileAlertState;
	}
	
	public void alert() {
		mobileAlertState.doAction();
	}

}
