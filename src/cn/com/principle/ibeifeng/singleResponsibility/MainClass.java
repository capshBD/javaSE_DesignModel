package cn.com.principle.ibeifeng.singleResponsibility;

/**
 * @author Superior
 * @date 2019-5-26
 *  就一个类而言，应该仅有一个引起它变化的原因。
	每一个职责都是一个变化的轴线，当需求变化
	时会反映为类的职责的变化。如果一个类承担的
	职责多于一个，那么引起它变化的原因就有多个。
	一个职责的变化甚至可能会削弱或者抑制类完成
	其他职责的能力，从而导致脆弱的设计。

 */
public class MainClass {
	public static void main(String[] args) {
		Input input = new Input();
		input.shuru();
		Validator validator = new Validator();
		if(validator.validate(input.getUsername(), input.getUpassword())){
			DBManager.getConnection();
			DAOImp dao = new DAOImp();
			dao.save(input.getUsername(), input.getUpassword());
		}
	}
}
