package cn.com.structModel.bridgeModel;
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

//中杯
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

//大杯
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