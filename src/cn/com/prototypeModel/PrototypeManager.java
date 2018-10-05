package cn.com.prototypeModel;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
	private static PrototypeManager protoManger=null;
	private Map<String,Prototype> protoObjs;
	private PrototypeManager(){
		protoObjs=new HashMap<String,Prototype>();
	}
	
	public static synchronized PrototypeManager getPrototypeManager(){
		if(protoManger==null)
			protoManger= new PrototypeManager();
		return protoManger;
	}
	
	private void register(String name,Prototype prototype) {
		protoObjs.put(name, prototype);
	}
	public void unregister(String name) {
		protoObjs.remove(name);
	}
	
	public Prototype getPrototype(String name) throws Exception{
		if(protoObjs.containsKey(name))
			return (Prototype) protoObjs.get(name).clone();
		else{
			Prototype proto=(Prototype) Class.forName(name).newInstance();
			register(name, proto);
			return proto;
		}
	}
}
