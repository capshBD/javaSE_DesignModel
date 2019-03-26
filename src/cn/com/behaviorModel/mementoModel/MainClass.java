package cn.com.behaviorModel.mementoModel;

public class MainClass {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.createMemento();
		o.modifyState4Test(80);
		o.setMemento();
	}
}
