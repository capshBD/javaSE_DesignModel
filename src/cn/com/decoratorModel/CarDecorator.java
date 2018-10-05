package cn.com.decoratorModel;

public abstract class CarDecorator implements Car {
	private Car car;

	public CarDecorator(Car car) {
		super();
		this.car = car;
	}
	public Car getCar() {
		return car;
	}
}
