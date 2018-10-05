package cn.com.flyweight;

public class ConcreteFlyweight implements Flyweight {
	private ExtrinsicState state;
	
	public ConcreteFlyweight(ExtrinsicState state) {
		super();
		this.state = state;
	}

	public void operation() {
		System.out.println(this.state.show());
	}

}
