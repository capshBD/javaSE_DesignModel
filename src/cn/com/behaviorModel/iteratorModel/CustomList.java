package cn.com.behaviorModel.iteratorModel;

import java.util.Arrays;
import java.util.Iterator;


public class CustomList <T> implements Iterable<T>{
	private Object elements[];
	private int size;
	private int capacity;
	private int defaultSize=1<<4;
	
	public CustomList(){
		this.capacity=this.defaultSize;
		this.elements=new Object[this.capacity];
	}
	public CustomList(int size){
		int initSize=1;
		while(initSize<size)
			initSize<<=1;
		this.capacity=initSize;
		this.elements=new Object[this.capacity];
	}
	
	public T addElement(T t){
		elements[size++]=t;
		return t;
	}
	
	public int getSize(){
		return size;
	}
	
	private class CustomIterator implements Iterator<T>{
		private int  modCount=0;
		private int  eleLength=size;
		//已经进行了一次迭代的标志
		private boolean flag=false;
		
		//限制不能再迭代过程中对容器元素进行增删
		@Override
		public boolean hasNext() {
			if(size>0&&size!=eleLength&&flag)
				throw new RuntimeException("modify index Exception!");
			
			//增加在还没有进行hasNext()方法之前,可以在集合中增删元素
			if(!flag){
				eleLength=size;
				flag=true;
			}
			
			return modCount!=size&&size>0;
		}

		@Override
		public T next() {
			return (T) elements[modCount++];
		}

		@Override
		public void remove() {
			Arrays.fill(elements, null);
			size=0;
		}
		
	}

	@Override
	public Iterator<T> iterator() {
		return new CustomIterator();
	}
}
