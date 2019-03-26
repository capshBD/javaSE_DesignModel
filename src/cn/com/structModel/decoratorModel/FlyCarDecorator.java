package cn.com.structModel.decoratorModel;

public class FlyCarDecorator extends CarDecorator{

	public FlyCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void show() {
		this.getCar().show();
		System.out.println("FlyCar的价格"+this.getPrice());
	}

	@Override
	public int getPrice() {
		
		return this.getCar().getPrice()+200;
	}

}
