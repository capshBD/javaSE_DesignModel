package cn.com.behaviorModel.visitorModel;
//定义一个Accept操作,也就是说让Collection每个元素具备可访问性
public interface Visitable {
	public void accept(Visitor visitor);
}
