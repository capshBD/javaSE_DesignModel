package cn.com.structModel.decoratorModel;

/**
 * @author capshBD
 * @date 2019-3-25
 * Car装饰器,包含一个本类接口的变量,对其进行装饰方法时,调用变量的同名方法,以达到新的对象中对原来的对象的相同方法进行调用,获取返回值
 * 对新的对象进行装饰
 */
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
