package cn.com.principle.ibeifeng.singleResponsibility;

public class Validator {
	public boolean validate(String username, String upassword) {
		if(username == null || "".equals(username.trim())) {
			System.out.println("用户名不能为空");
			return false;
		}
		if(upassword == null || "".equals(upassword.trim())) {
			System.out.println("密码不能为空");
			return false;
		}
		return true;
	}
}
