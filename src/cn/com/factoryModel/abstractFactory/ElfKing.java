package cn.com.factoryModel.abstractFactory;

public class ElfKing implements King {
	 static final String DESCRIPTION = "这是精灵国王!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
