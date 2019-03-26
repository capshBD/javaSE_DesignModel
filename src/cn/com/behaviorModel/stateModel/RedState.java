package cn.com.behaviorModel.stateModel;

import java.awt.Color;

public class RedState extends State {

	public void handlePush(Context c) {
		c.setState(new BlueState());

	}

	public void handlePull(Context c) {
		c.setState(new GreenState());

	}

	public Color getColor() {
		return (Color.red);
	}

}
