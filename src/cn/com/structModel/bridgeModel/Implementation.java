package cn.com.structModel.bridgeModel;

class Abstraction {
	// 维护着一个指向实现（Implementor）角色的引用
	private Implementation implementation;
	
	public Abstraction() {
		super();
	}

	public Abstraction(Implementation imp) {
		implementation = imp;
	}

	// 下面定义了前端（抽象部分）应该有的接口
	public void service1() {
		// 使用了后端（实现部分）已有的接口
		// 组合实现功能
		implementation.facility1();
		implementation.facility2();
	}

	public void service2() {
		implementation.facility2();
		implementation.facility3();
	}

	public void service3() {
		implementation.facility1();
		implementation.facility2();
		implementation.facility4();
	}

	// For use by subclasses:
	protected Implementation getImplementation() {
		return implementation;
	}
}

// 抽象部分（前端）的精确抽象角色
class ClientService1 extends Abstraction {
	public ClientService1(Implementation imp) {
		super(imp);
	}

	// 使用抽象角色提供的方法组合起来完成某项功能
	// 这就是为什么叫精确抽象角色（修正抽象角色）
	public void serviceA() {
		service1();
		service2();
	}

	public void serviceB() {
		service3();
	}
}

// 另一个精确抽象角色，和上面一样的被我省略了
class ClientService2 extends Abstraction {
	// 这里是直接通过实现部分的方法来实现一定的功能
	public void serviceE() {
		getImplementation().facility3();
	}
}

// 实现部分（后端）的实现角色
interface Implementation {
	// 这个接口只是定义了一定的接口
	void facility1();

	void facility2();

	void facility3();

	void facility4();
}

// 具体实现角色就是要将实现角色提供的接口实现
// 并完成一定的功能
// 这里省略了
class Implementation1 implements Implementation {

	@Override
	public void facility1() {
		
		
	}

	@Override
	public void facility2() {
		
		
	}

	@Override
	public void facility3() {
		
		
	}

	@Override
	public void facility4() {
		
		
	}

}