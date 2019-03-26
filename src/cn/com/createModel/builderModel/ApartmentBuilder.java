package cn.com.createModel.builderModel;

//修公寓工程队
public class ApartmentBuilder implements HouseBuilder {
	private House house;

	public ApartmentBuilder(String name) {
		super();
		house=new House(name);
	}

	@Override
	public void makeFloor() {
		house.setFloor(house.getName()+"的地板");

	}

	@Override
	public void makeWall() {
		house.setWall(house.getName()+"的墙");

	}

	@Override
	public void makeHouseTop() {
		house.setHousetop(house.getName()+"的屋顶");

	}

	@Override
	public House getHouse() {
		return house;
	}

}
