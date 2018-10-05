package cn.com.flyweight;

public class MainClass {
	public static void main(String[] args) {
		FlyweightFactory fac=new FlyweightFactory();
		Flyweight ft=fac.getFlyweight("a");
		Flyweight ft2=fac.getFlyweight("b");
		Flyweight ft3=fac.getFlyweight("a");
		Flyweight ft4=fac.getFlyweight("d");
		System.out.println(ft==ft3);
	}
}
