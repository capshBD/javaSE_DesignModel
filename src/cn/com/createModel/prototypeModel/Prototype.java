package cn.com.createModel.prototypeModel;
public abstract class Prototype implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
