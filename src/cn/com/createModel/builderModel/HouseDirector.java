package cn.com.createModel.builderModel;

public class HouseDirector {
	
	//知道某个HouseBuilder具体的实现建造对象,让建造对象执行具体的get,set方法
	public void makeHouse(HouseBuilder builder){
		builder.makeFloor();
		builder.makeHouseTop();
		builder.makeWall();
	}
}
