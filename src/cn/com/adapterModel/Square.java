package cn.com.adapterModel;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("我在画方");
	}

	@Override
	public void show() {
		System.out.println("显示方");
	}

}
