package cn.com.createModel.factoryModel.abstractFactory;


public class OrcCastle implements Castle {
	 static final String DESCRIPTION = "这是兽人城堡!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
