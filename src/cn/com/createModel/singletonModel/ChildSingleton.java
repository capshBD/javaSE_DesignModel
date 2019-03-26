package cn.com.createModel.singletonModel;

public class ChildSingleton extends Singleton{

	public static ChildSingleton getInstance(){
		return (ChildSingleton) Singleton.getInstance(ChildSingleton.class.getName());
	}
}
