package cn.com.visitorModel;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Visitor visitor=new ConcreteVisitor();
		Visitable vistable=new ConcreteElement("可访问de字符传");
		Visitable vistable2=new ConcreteElement2(new Date(999999));
		
		List<Visitable> list=new ArrayList<Visitable>();
		list.add(vistable);
		list.add(vistable2);
		Visitable vistableColl=new ConcreteElementColl(list);
		vistableColl.accept(visitor);
		
	}
}
