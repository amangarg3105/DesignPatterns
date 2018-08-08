package chainOfResponsiblityDesignPattern;

public class Rupee10Dispenser implements DispenseChain {
	
	DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain chain) {
		this.chain = chain;
		
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 10){
			int num = cur.getAmount()/10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing "+num+" 10Rupees note");
			if(remainder !=0) chain.dispense(new Currency(remainder));
		}else{
			this.chain.dispense(cur);
		}
		
	}
}
