package chainOfResponsiblityDesignPattern;

public class Rupee50Dispenser implements DispenseChain {
	
	DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain chain) {
		this.chain = chain;
		
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 50){
			int num = cur.getAmount()/50;
			int remainder = cur.getAmount() % 50;
			System.out.println("Dispensing "+num+" 50Rupees note");
			if(remainder !=0) chain.dispense(new Currency(remainder));
		}else{
			this.chain.dispense(cur);
		}
		
	}

}
