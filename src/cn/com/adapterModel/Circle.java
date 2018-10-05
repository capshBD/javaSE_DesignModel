package cn.com.adapterModel;

public class Circle implements Shape{
	private TextCircle textCircle;

	public Circle(TextCircle textCircle) {
		super();
		this.textCircle = textCircle;
	}
	
	public Circle() {
		super();
	}


	@Override
	public void draw() {
		textCircle.paint();
	}

	@Override
	public void show() {
		textCircle.display();
	}
	
}
