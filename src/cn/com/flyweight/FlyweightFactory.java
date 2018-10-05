package cn.com.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	// Flyweight pool
	private Hashtable flyweights = new Hashtable();

	public Flyweight getFlyweight(Object key) {

		Flyweight flyweight = (Flyweight) flyweights.get(key);

		if (flyweight == null) {
			// 产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight(new IntrinsicState(key.toString()));
			flyweights.put(key, flyweight);
		}

		return flyweight;
	}
}
