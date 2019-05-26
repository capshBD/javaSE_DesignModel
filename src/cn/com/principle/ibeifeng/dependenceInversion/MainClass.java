package cn.com.principle.ibeifeng.dependenceInversion;

/**
 * @author Superior
 * @date 2019-5-26
 * 1.抽象不应该依赖于细节，细节应该依赖于抽象。
    2.高层模块不依赖底层模块，两者都依赖抽象
 */
public class MainClass {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setMainBoard(new HuaSuoMainBoard());
		computer.setMemory(new JinShiDunMemory());
		computer.setHarddisk(new XiJieHardDisk());
		
		computer.display();
		
		System.out.println("-------------");
		
		computer.setMainBoard(new WeiXingMainBoard());
		computer.display();
	}
}
