package cn.com.chainModel;
public abstract class Handler{
	private Handler handler;
	public Handler setHandler(Handler handler) {
		this.handler = handler;
		return handler;
	}
	public Handler getHandler() {
		return handler;
	}
	
	public abstract void handleRequest(Request request);
	
	protected  void after() {
		System.out.println("经过方法");
	}
}