package cn.com.decoratorModel;

public class MainClass {
	public static void main(String[] args) {
		Car car=new RunCar();
		car.show(); 
		
		car=new SwimCarDecorator(car);
		car.show(); 
		
		car=new FlyCarDecorator(car);
		car.show();
	}
}
