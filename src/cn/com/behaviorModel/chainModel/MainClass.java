package cn.com.behaviorModel.chainModel;
public class MainClass {
	public static void main(String[] args) {
		Handler handler=new StageHandler();
		handler.setHandler(new ConcreteHandler())//handler的handler成员变量设置为ConcreteHandler,并且这个方法返回ConcreteHandler
			   .setHandler(new BusinessHandler());
		handler.handleRequest(new OperatorRequset("operator"));
	}
}
