package cn.com.principle.ibeifeng.dependenceInversion;

/*
 *迪米特法则(Law of Demeter )又叫做最少知识原则，也就是说，一个对象应当对其他对象尽可能少的了解
 *如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用。如果其中一个类需要调用另一类的某一个方法的话，可以通过第三者转发这个调用
 *比如中介者模式
 */
public class Computer {
	private MainBoard mainBoard;
	private Memory memory;
	private HardDisk harddisk;

	public MainBoard getMainBoard() {
		return mainBoard;
	}

	public void setMainBoard(MainBoard mainBoard) {
		this.mainBoard = mainBoard;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public HardDisk getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(HardDisk harddisk) {
		this.harddisk = harddisk;
	}

	public void display() {
		mainBoard.doSomething();
		memory.doSomething();
		harddisk.doSomething();
	}
}
