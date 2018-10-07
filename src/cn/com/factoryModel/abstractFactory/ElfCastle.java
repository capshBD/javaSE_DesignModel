package cn.com.factoryModel.abstractFactory;

public class ElfCastle implements Castle {
	 static final String DESCRIPTION = "这是精灵城堡!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
