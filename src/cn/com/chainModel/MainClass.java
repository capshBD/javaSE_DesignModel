package cn.com.chainModel;

public class MainClass {
	public static void main(String[] args) {
		Handler handler=new StageHandler();
		handler.setHandler(new ConcreteHandler())
			   .setHandler(new BusinessHandler());
		handler.handleRequest(new OperatorRequset("operator"));
	}
}
