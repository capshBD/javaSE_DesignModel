package cn.com.behaviorModel.iteratorModel;

import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		CustomList<String> list=new CustomList<String>(10);
		list.addElement("java");
		list.addElement("linux");
		list.addElement("c++");
		list.addElement("python");
		list.addElement("jquery");
		list.addElement("php");
		
		Iterator<String> it=list.iterator();
		list.addElement("jsp");
		System.out.println(list.getSize());
		//it.remove();
		for(;it.hasNext();){
			String str=it.next();
			System.out.println(str);
			//it.remove();
			if(str.equals("python"))
			list.addElement("javascript");
		
		}
	}
}
