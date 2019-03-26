package cn.com.structModel.decoratorModel;

public class RunCar implements Car {

	@Override
	public void show() {
		System.out.println("跑车价格"+getPrice());
	}

	@Override
	public int getPrice() {
		return 50;
	}

}
