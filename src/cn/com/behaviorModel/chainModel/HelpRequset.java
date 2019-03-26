package cn.com.behaviorModel.chainModel;
public class HelpRequset extends Request{

	public HelpRequset(String type) {
		super(type);
	}

	@Override
	protected void execute() {
		System.out.println("help function");
	}

}
