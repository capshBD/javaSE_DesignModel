package cn.com.strategyModel;

public class StrategyB implements Strategy {

	@Override
	public double cost(double num) {
		return num>=200?num-20:num;
	}

}
