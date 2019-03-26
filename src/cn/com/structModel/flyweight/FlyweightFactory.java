package cn.com.structModel.flyweight;

import java.util.Hashtable;

/**
 * @author capshBD
 * @date 2019-3-25
 * 按照某种规则的key缓存一些享元对象
 */
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
