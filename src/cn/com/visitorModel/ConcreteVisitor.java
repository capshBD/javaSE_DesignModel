package cn.com.visitorModel;

import java.sql.Date;
import java.util.Collection;
import java.util.Iterator;
//访问者的具体实现
public class ConcreteVisitor implements Visitor {
	// 在本方法中,我们实现了对Collection的元素的成功访问
	public void visitCollection(Collection collection) {
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object o = iterator.next();
			if (o instanceof Visitable)
				((Visitable) o).accept(this);
		}
	}

	public void visitString(String string) {
		System.out.println("'" + string + "'");
	}

	public void visitFloat(Float flt) {
		System.out.println(flt.toString() + "f");
	}

	@Override
	public void visitDate(Date date) {
		System.out.println(date.toLocaleString());
	}
}
