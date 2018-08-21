package factoryDesignPattern;

import java.util.ArrayList;

public class CarFactory {
	
	private CarFactory() {
		//prevent instantiation
	}
	 public static Car buildCar(CarType model) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	        Car car = null;
	       /* ArrayList<Class<?>> list = new ArrayList<>();
	        list.add(SmallCar.class);*/
	        car = newIntsance("SmallCar".trim());
	       
	        //car.construct();
	     /* Car c = Class.forName(model.toString()).newInstance();*/
	       /* switch (model) {
	        case SMALL:
	            car = new SmallCar();
	            break;
	 
	        case SEDAN:
	            car = new SedanCar();
	            break;
	 
	        case LUXURY:
	            car = new LuxuryCar();
	            break;
	 
	        default:
	            // throw some exception
	            break;
	        }
	        */
	        
	        return car;
	    }
	 
	 private static Car newIntsance(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		 return (Car) Class.forName("factoryDesignPattern.SmallCar").newInstance();
	 }
}
