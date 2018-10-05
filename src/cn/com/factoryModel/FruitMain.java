package cn.com.factoryModel;

public class FruitMain {
		public static void main(String[] args) throws Exception {
			Fruit banana=FruitFactory.getFruitInstance("cn.com.factoryModel.Banana");
			Fruit apple=FruitFactory.getFruitInstance("cn.com.factoryModel.Apple");
			banana.eat("小明");
			apple.eat("李红");
		}
}
