package cn.com.createModel.factoryModel;
public class FruitFactory {
	
	@SuppressWarnings("unchecked")
	public static Fruit getFruitInstance(String type){
		
		try {
			Class<Fruit> fruit=(Class<Fruit>) Class.forName(type);
			return fruit.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
