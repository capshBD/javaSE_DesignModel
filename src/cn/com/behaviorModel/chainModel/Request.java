package cn.com.behaviorModel.chainModel;
public abstract class Request {
	private String type;

	public Request(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	protected abstract void execute(); 
}
