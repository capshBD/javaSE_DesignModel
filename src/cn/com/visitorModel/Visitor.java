package cn.com.visitorModel;

import java.sql.Date;
import java.util.Collection;
//visitor访问者
public interface Visitor {
	public void visitCollection(Collection collection);

	public void visitString(String string);

	public void visitFloat(Float flt);
	
	public void visitDate(Date date);
}
