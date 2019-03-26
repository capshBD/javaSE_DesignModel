package cn.com.structModel.adapterModel;

/**
 * @author capshBD
 * @date 2019-3-25
 * 适配器角色,想要调用另一种接口的方法
 */
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
