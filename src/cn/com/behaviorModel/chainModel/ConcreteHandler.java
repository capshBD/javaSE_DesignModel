package cn.com.behaviorModel.chainModel;
public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getType().equals("help")){
			request.execute();
			return;
		}
		if(this.getHandler()==null)
			throw new RuntimeException("无法处理此次请求");
		after();
		this.getHandler().handleRequest(request);
			
	}

}
