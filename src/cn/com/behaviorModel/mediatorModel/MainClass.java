package cn.com.behaviorModel.mediatorModel;

public class MainClass {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Person zhangsan = new Man("����",7,mediator);
		Person lisi = new Man("����",7,mediator);
		Person xiaofang = new Woman("С��",7,mediator);
		
		zhangsan.getPartner(lisi);
		
		xiaofang.getPartner(lisi);
	}
}
