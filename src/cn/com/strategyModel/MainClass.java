package cn.com.strategyModel;

public class MainClass {
	public static void main(String[] args) {
		Strategy s=new StrategyA();
		Context ct=new Context(s);
		System.out.println(ct.cost(344.4));
	}
}
