package cn.com.createModel.factoryModel;
public class Banana implements Fruit {

	@Override
	public void eat(String name) throws Exception {
		System.out.println(name+"吃banana");
	}

}
