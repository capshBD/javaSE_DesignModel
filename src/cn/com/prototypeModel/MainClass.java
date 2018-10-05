package cn.com.prototypeModel;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) throws Exception {
		Person p=new Person();
		p.setAge(12);
		p.setName("小米");
		p.setSex("男");
		List<String> fds=new ArrayList<String>();
		fds.add("james");
		fds.add("yaoming");
		p.setFriends(fds);
		
		Person p2=p.clone();
		p.getFriends().add("kebi");
		System.out.println(p.getFriends());
		System.out.println(p2.getFriends());
		
		PrototypeManager manger=PrototypeManager.getPrototypeManager();
		Person pp=(Person) manger.getPrototype("cn.com.prototypeModel.Person");
		pp.setAge(45);
		pp.setSex("girl");
		pp.setName("stven jobs");
		List<String> fids=new ArrayList<String>();
		fids.add("bigates");
		fids.add("lzjun");
		pp.setFriends(fids);
		
		Person pp2=(Person) PrototypeManager.getPrototypeManager().getPrototype("cn.com.prototypeModel.Person");
		pp.getFriends().add("mayun");
		System.out.println(pp);
		System.out.println(pp2);
	}
}
