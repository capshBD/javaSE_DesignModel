package cn.com.structModel.combinationModel;

public class Disk extends Equipment {
	public Disk(String name) {
		super(name);
	}

	// 定义Disk网络价格为1
	public double netPrice() {
		return 1.;
	}

	// 定义了disk折扣价格是0.5 对折。
	public double discountPrice() {
		return .5;
	}
}
