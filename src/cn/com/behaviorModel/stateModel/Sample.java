package cn.com.behaviorModel.stateModel;

import java.awt.Color;

public class Sample {
	private Color c;
	public Sample(Color c){
		this.c=c;
	}
	
	public void operate() {
		System.out.println(c);

	}
}
