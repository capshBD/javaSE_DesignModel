package cn.com.behaviorModel.chainModel;
public class OperatorRequset extends Request{

	public OperatorRequset(String type) {
		super(type);
	}

	@Override
	protected void execute() {
		System.out.println("operator function");
	}

}
