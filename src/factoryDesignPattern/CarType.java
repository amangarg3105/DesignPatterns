package factoryDesignPattern;

public enum CarType {
	
	SMALL,LUXURY,SEDAN;
	/*SMALL("SMALL") {
		public Car getInstance() {
			return new SmallCar();
		}
	};

	private CarType(String type) {
		this.type = type;
	}

	private String type;

	public abstract Car getInstance();

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "TYPE CODE -> " + type;
	}*/
}
