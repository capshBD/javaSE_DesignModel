package cn.com.createModel.factoryModel.abstractFactory;
//精灵王国工厂,返回具体的进行王国的产品
public class ElfKingdomFactory implements KingdomFactory {
  public Castle createCastle() {
    return new ElfCastle();
  }
  public King createKing() {
    return new ElfKing();
  }
  public Army createArmy() {
    return new ElfArmy();
  }
}