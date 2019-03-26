package cn.com.createModel.singletonModel;

public class MainClass {
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance(null);
		ChildSingleton cs1=ChildSingleton.getInstance();
		Singleton s2=Singleton.getInstance(null);
		ChildSingleton cs2=ChildSingleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(cs1);
		System.out.println(cs2);
	}
}
