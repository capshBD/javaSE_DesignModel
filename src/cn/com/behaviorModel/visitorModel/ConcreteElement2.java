package cn.com.behaviorModel.visitorModel;

import java.sql.Date;

public class ConcreteElement2 implements Visitable {
	private Date date;

	public ConcreteElement2(Date date) {
		this.date = date;
	}

	// 定义accept的具体内容 这里是很简单的一句调用
	public void accept(Visitor visitor) {
		visitor.visitDate(date);
	}
}
