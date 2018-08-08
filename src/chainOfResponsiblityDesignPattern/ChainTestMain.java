package chainOfResponsiblityDesignPattern;

import java.util.Scanner;

/*
 * Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is passed to a 
 * chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request and
 *  whether the request is required to be sent to the next object in the chain or not.
 *  
 *  One of the great example of Chain of Responsibility pattern is ATM Dispense machine. The user enters the amount to be dispensed
 *   and the machine dispense amount in terms of defined currency bills such as 50$, 20$, 10$ etc.
If the user enters an amount that is not multiples of 10, it throws error. We will use Chain of Responsibility pattern to 
implement this solution
 */
public class ChainTestMain {

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		Scanner input = new Scanner(System.in);
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				input.close();
				return;
			}
			atmDispenser.getC1().dispense(new Currency(amount));
		}
	}

}
