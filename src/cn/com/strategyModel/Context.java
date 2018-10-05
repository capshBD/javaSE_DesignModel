package cn.com.strategyModel;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public double cost(double num){
		return this.strategy.cost(num);
	}
}
