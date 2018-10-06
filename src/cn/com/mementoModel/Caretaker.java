package cn.com.mementoModel;

//“备忘录管理者角色”
public class Caretaker {
	private MementoIF m;
	
	public void saveMemento(MementoIF m){
		this.m=m;
	}
	
	public MementoIF getMemento(){
		return m;
	}
}
