package cn.com.stateModel;

import java.awt.Color;

public class BlueState extends State {

	public void handlePush(Context c) {
		// 根据push方法"如果是blue状态的切换到green" ;
		c.setState(new RedState());

	}

	public void handlePull(Context c) {

		// 根据pull方法"如果是blue状态的切换到red" ;
		c.setState(new GreenState());

	}

	public Color getColor() {
		return (Color.blue);
	}

}
