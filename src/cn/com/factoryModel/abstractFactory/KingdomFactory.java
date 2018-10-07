package cn.com.factoryModel.abstractFactory;

//王国工厂
public interface KingdomFactory {
	  Castle createCastle();
	  King createKing();
	  Army createArmy();
}
