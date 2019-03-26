package cn.com.createModel.factoryModel.abstractFactory;

//王国工厂,含有创建城堡,国王,军队的公共抽象
/**
 * @author capshBD
 * @date 2019-3-25
 * 工厂是抽象的,由子类扩展成具体的工厂,生产具体的产品,
 * 每种产品也有抽象,根据工厂类型的不同创建出对应的具体产品
 * 每种产品体系的产品可以由不同的具体工厂创建
 */
public interface KingdomFactory {
	  Castle createCastle();
	  King createKing();
	  Army createArmy();
}
