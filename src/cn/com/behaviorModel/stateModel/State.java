package cn.com.behaviorModel.stateModel;

import java.awt.Color;

public abstract class State{

	public abstract void handlePush(Context c);
	public abstract void handlePull(Context c);
	public abstract Color getColor();

}
