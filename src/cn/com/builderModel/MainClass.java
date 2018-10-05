package cn.com.builderModel;

public class MainClass {
	
	public static void main(String[] args) {
		ApartmentBuilder aptBuildert=new ApartmentBuilder("公寓");
		HouseDirector direct=new HouseDirector();
		direct.makeHouse(aptBuildert);
		System.out.println(aptBuildert.getHouse());
	}
}
