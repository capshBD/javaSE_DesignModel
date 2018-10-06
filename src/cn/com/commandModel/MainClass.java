package cn.com.commandModel;

import java.util.Iterator;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<Command> queue=Producer.produceRequests();
		for(Iterator<Command> it=queue.iterator();it.hasNext();)
			it.next().execute();
	}
}
