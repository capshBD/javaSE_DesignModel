package cn.com.createModel.factoryModel.abstractFactory;


public class OrcArmy implements Army {
	 static final String DESCRIPTION = "这是兽人军队!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
