package cn.com.structModel.bridgeModel;
abstract class CoffeeImp {
	public abstract void pourCoffeeImp();
}



//加奶
class MilkCoffeeImp extends CoffeeImp {
	MilkCoffeeImp() {
	}

	public void pourCoffeeImp() {
		System.out.println("加了美味的牛奶");
	}
}

//不加奶
class FragrantCoffeeImp extends CoffeeImp {
	FragrantCoffeeImp() {
	}

	public void pourCoffeeImp() {
		System.out.println("什么也没加,清香");
	}
}