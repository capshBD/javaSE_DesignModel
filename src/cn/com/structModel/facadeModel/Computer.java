package cn.com.structModel.facadeModel;

public class Computer implements Operater{
	private Operater cpu;
	private Operater memory;
	private Operater disk;
	
	public Computer(){
		this.cpu=new Cpu();
		this.memory=new Memory();
		this.disk=new Disk();
	}

	@Override
	public void start() {
		System.out.println("开电脑");
		cpu.start();
		memory.start();
		disk.start();
		
	}

	@Override
	public void stop() {
		System.out.println("关电脑");
		cpu.stop();
		memory.stop();
		disk.stop();
		
	}

}
