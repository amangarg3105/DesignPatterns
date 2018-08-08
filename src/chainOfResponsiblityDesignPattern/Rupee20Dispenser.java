package chainOfResponsiblityDesignPattern;

public class Rupee20Dispenser implements DispenseChain {
	DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain chain) {
		this.chain = chain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 20){
			int num = cur.getAmount()/20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing "+num+" 20Rupees  note");
			if(remainder !=0) chain.dispense(new Currency(remainder));
		}else{
			this.chain.dispense(cur);
		}
		
	}
}
