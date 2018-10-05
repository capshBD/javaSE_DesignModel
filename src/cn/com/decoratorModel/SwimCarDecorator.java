package cn.com.decoratorModel;

public class SwimCarDecorator extends CarDecorator {

	public SwimCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void show() {
		this.getCar().show();
		System.out.println("SwimCar的价格"+this.getPrice());
	}

	@Override
	public int getPrice() {
		
		return this.getCar().getPrice()+50;
	}

}
