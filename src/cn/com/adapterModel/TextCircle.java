package cn.com.adapterModel;

public class TextCircle implements Graph{

	@Override
	public void paint() {
		System.out.println("图形画圆");
	}

	@Override
	public void display() {
		System.out.println("显示图形圆");
	}
	
}
