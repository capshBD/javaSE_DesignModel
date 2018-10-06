package cn.com.chainModel;

public class BusinessHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getType().equals("operator")){
			request.execute();
			return;
		}
		if(this.getHandler()==null)
			throw new RuntimeException("无法处理此次请求");
		after();
		this.getHandler().handleRequest(request);
	}

}
