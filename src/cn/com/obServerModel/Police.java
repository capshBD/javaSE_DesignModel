package cn.com.obServerModel;

import java.util.Observable;

public class Police extends Observable {
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		setChangedNotifyObservers();
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		setChangedNotifyObservers();
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		setChangedNotifyObservers();
		this.age = age;
	}
	
	private void setChangedNotifyObservers(){
		this.setChanged();
		this.notifyObservers();
	}
}
