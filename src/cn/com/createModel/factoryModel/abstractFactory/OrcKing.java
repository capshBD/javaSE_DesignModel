package cn.com.createModel.factoryModel.abstractFactory;


public class OrcKing implements King {
	 static final String DESCRIPTION = "这是兽人国王!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
