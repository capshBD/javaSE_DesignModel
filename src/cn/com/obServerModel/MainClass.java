package cn.com.obServerModel;
public class MainClass {
	public static void main(String[] args) {
		Police person = new Police();
		//注册观察者
		person.addObserver(new MyObServer());
		person.addObserver(new MyObServer());
		System.out.println(person.countObservers());
		person.setName("lifengxing");
		person.setAge(23);
		person.setSex("男");
	}
}