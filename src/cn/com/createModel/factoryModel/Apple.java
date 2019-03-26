package cn.com.createModel.factoryModel;

public class Apple implements Fruit {

	@Override
	public void eat(String name) throws Exception {
		System.out.println(name+"吃apple");
	}

}
