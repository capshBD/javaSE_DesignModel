package cn.com.behaviorModel.stateModel;

import java.awt.Color;

public class GreenState extends State {

	public void handlePush(Context c) {
		c.setState(new RedState());

	}

	public void handlePull(Context c) {
		c.setState(new BlueState());

	}

	public Color getColor() {
		return (Color.green);
	}

}
