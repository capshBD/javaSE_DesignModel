package cn.com.principle.ibeifeng.openClose;

public class MainClass {
	public static void main(String[] args) {
		
		BankWorker bankWorker2 = new DrawingBankWorker();
		bankWorker2.operation();
		
		BankWorker bankWorker3 = new ZhuanZhangBankWorker();
		bankWorker3.operation();
	}
}
