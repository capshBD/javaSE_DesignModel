package cn.com.structModel.facadeModel;

public class Disk implements Operater{

	@Override
	public void start() {
		System.out.println("Disk start");
	}

	@Override
	public void stop() {
		System.out.println("Disk stop");
	}

}
