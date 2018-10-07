package cn.com.factoryModel.abstractFactory;

import cn.com.factoryModel.abstractFactory.FactoryMaker.KingdomType;

public class MainClass {
	public static void main(String[] args) {
		App app=new App();
		app.createKingdom(FactoryMaker.makeFactory(KingdomType.ORC));
		System.out.println(app.getArmy().getDescription());
		System.out.println(app.getCastle().getDescription());
		System.out.println(app.getKing().getDescription());
	} 
}
