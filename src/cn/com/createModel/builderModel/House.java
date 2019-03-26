package cn.com.createModel.builderModel;
/*
 * 房子
 */
public class House {
	
	private String name;
	// 地板
	private String floor;
	// 墙
	private String wall;
	// 屋顶
	private String housetop;
	 
	public House(String name) {
		super();
		this.name=name;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getHousetop() {
		return housetop;
	}

	public void setHousetop(String housetop) {
		this.housetop = housetop;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "House [name=" + name + ", floor=" + floor + ", wall=" + wall
				+ ", housetop=" + housetop + "]";
	}
	
	
}
