package cn.com.structModel.flyweight;

public class IntrinsicState implements ExtrinsicState{
	private String atc_value;
	
	public IntrinsicState(String atc_value) {
		super();
		this.atc_value = atc_value;
	}

	@Override
	public String show() {
		return "我的"+this.atc_value;
	}

}
