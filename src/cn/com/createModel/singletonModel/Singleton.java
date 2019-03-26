package cn.com.createModel.singletonModel;


import java.util.HashMap;
import java.util.Map;

public class Singleton {
	private static Map<String,Singleton> registObjs=new HashMap<String,Singleton>();
	protected Singleton(){};
	
	public static Singleton getInstance(String name){
			if(name==null)
				name="cn.com.createModel.singletonModel.Singleton";
			if(registObjs.get(name)==null){
				try {
					Singleton instance=(Singleton) Class.forName(name).newInstance();
					registObjs.put(name, instance);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return registObjs.get(name);
	}
}
