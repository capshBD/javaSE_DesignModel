package cn.com.structModel.bridgeModel;


public class CoffeeMainClass{
	public static void main(String[] args) {
		//拿出牛奶
		new CoffeeImpSingleton(new MilkCoffeeImp());
		//中杯加奶,把加奶的Coffee桥接进去
		MediumCoffee mediumCoffee = new MediumCoffee();
		mediumCoffee.pourCoffee();

		//大杯加奶,把加奶的Coffee桥接进去
		SuperSizeCoffee superSizeCoffee = new SuperSizeCoffee();
		superSizeCoffee.pourCoffee();
		
		new CoffeeImpSingleton(new FragrantCoffeeImp());
		//中杯不加,把不加的Coffee桥接进去
		mediumCoffee = new MediumCoffee();
		mediumCoffee.pourCoffee();
		superSizeCoffee = new SuperSizeCoffee();
		superSizeCoffee.pourCoffee();
		
	}
	
}
