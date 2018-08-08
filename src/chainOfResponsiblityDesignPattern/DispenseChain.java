package chainOfResponsiblityDesignPattern;

public interface DispenseChain {

	public void setNextChain(DispenseChain chain);
	public void dispense(Currency curr);
}
