package cn.com.createModel.builderModel;

//工程队
public interface HouseBuilder {
	public void makeFloor();
	public void makeWall();
	public void makeHouseTop();
	public House getHouse();
}
