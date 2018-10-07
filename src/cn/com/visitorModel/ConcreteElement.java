package cn.com.visitorModel;

public class ConcreteElement implements Visitable {
	private String value;

	public ConcreteElement(String string) {
		value = string;
	}

	// 定义accept的具体内容 这里是很简单的一句调用
	public void accept(Visitor visitor) {
		visitor.visitString(this.value);
	}
}
