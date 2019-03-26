package cn.com.behaviorModel.obServerModel;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o.getClass().getName()+arg);
		System.out.println("对象状态发生了变化");

	}

}
