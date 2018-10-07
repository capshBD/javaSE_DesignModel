package cn.com.visitorModel;

import java.util.Collection;

public class ConcreteElementColl implements Visitable {
	private Collection coll;

	public ConcreteElementColl(Collection coll) {
		this.coll = coll;
	}

	// 定义accept的具体内容 这里是很简单的一句调用
	public void accept(Visitor visitor) {
		visitor.visitCollection(coll);
	}
}
