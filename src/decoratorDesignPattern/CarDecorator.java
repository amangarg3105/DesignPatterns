package decoratorDesignPattern;

public class CarDecorator implements Car{

	Car c;
	
	public CarDecorator(Car c) {
		this.c = c;
	}
	
	@Override
	public void assemble() {
		c.assemble();  //new BasicCar.assemble
	}

}
