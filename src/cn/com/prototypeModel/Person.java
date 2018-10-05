package cn.com.prototypeModel;

import java.util.ArrayList;
import java.util.List;

public class Person extends Prototype{
	private String name;
	private int age;
	private String sex;
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Person clone() {
		try {
			Person person  = (Person)super.clone();
			//引用型变量进行深拷贝
			List<String> newfriends = new ArrayList<String>();
			for(String friend : this.getFriends()) {
				newfriends.add(friend);
			}
			person.setFriends(newfriends);
			return  person;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", friends=" + friends + "]";
	}
	
}
