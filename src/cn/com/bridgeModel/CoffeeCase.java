package cn.com.bridgeModel;

abstract class CoffeeImp {
	public abstract void pourCoffeeImp();
}

class CoffeeImpSingleton {
	private static CoffeeImp coffeeImp;

	public CoffeeImpSingleton(CoffeeImp coffeeImpIn) {
		coffeeImp = coffeeImpIn;
	}

	public static CoffeeImp getTheCoffeeImp() {
		return coffeeImp;
	}
}

abstract class Coffee {
	CoffeeImp coffeeImp;

	public void setCoffeeImp() {
		this.coffeeImp = CoffeeImpSingleton.getTheCoffeeImp();
	}

	public CoffeeImp getCoffeeImp() {
		return this.coffeeImp;
	}

	public abstract void pourCoffee();
}

// 中杯
class MediumCoffee extends Coffee {
	public MediumCoffee() {
		setCoffeeImp();
	}

	public void pourCoffee() {
		CoffeeImp coffeeImp = this.getCoffeeImp();
			System.out.print("中杯");
			coffeeImp.pourCoffeeImp();

	}
}

// 大杯
class SuperSizeCoffee extends Coffee {
	public SuperSizeCoffee() {
		setCoffeeImp();
	}

	public void pourCoffee() {
		CoffeeImp coffeeImp = this.getCoffeeImp();
			System.out.print("大杯");
			coffeeImp.pourCoffeeImp();

	}
}

// 加奶
class MilkCoffeeImp extends CoffeeImp {
	MilkCoffeeImp() {
	}

	public void pourCoffeeImp() {
		System.out.println("加了美味的牛奶");
	}
}

// 不加奶
class FragrantCoffeeImp extends CoffeeImp {
	FragrantCoffeeImp() {
	}

	public void pourCoffeeImp() {
		System.out.println("什么也没加,清香");
	}
}

public class CoffeeCase{
	public static void main(String[] args) {
		//拿出牛奶
		new CoffeeImpSingleton(new MilkCoffeeImp());
		//中杯加奶
		MediumCoffee mediumCoffee = new MediumCoffee();
		mediumCoffee.pourCoffee();

		//大杯加奶
		SuperSizeCoffee superSizeCoffee = new SuperSizeCoffee();
		superSizeCoffee.pourCoffee();
		
		new CoffeeImpSingleton(new FragrantCoffeeImp());
		mediumCoffee = new MediumCoffee();
		mediumCoffee.pourCoffee();
		superSizeCoffee = new SuperSizeCoffee();
		superSizeCoffee.pourCoffee();
		
	}
	
}
