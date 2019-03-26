package cn.com.createModel.factoryModel.abstractFactory;

public class ElfArmy implements Army {
	 static final String DESCRIPTION = "这是精灵军队!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
