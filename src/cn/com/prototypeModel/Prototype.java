package cn.com.prototypeModel;

public abstract class Prototype implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
