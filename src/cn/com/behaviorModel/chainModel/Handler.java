package cn.com.behaviorModel.chainModel;
/**
 * @author capshBD
 * @date 2019-3-25
 * Handler含有Handler的下一个责任链引用
 */
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