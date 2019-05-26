package cn.com.principle.ibeifeng.liskovSubstitution;

/**
 * @author Superior
 * @date 2019-5-26
 * 里氏代换原则(Liskov Substitution Principle)：
    一个软件实体如果使用的是一个子类的话，那么它不能适用于其父类。
 */
public class MainClass {
	public static void main(String[] args) {
		ChangFX changfx = new ChangFX();
		changfx.setHeight(10);
		changfx.setWidth(20);
		test(changfx);
		
		ZhengFX zhengfx = new ZhengFX();
		zhengfx.setHeight(10);
		test(zhengfx);
	}
	
	public static void test(Sibianxing sibianxing) {
		System.out.println(sibianxing.getHeight());
		System.out.println(sibianxing.getWidth());
	}
	
//	public static void resize(Sibianxing sibianxing) {
//		while(sibianxing.getHeight() <= sibianxing.getWidth()) {
//			sibianxing.setHeight(sibianxing.getHeight() + 1);
//			test(sibianxing);
//		}
//	}
}
