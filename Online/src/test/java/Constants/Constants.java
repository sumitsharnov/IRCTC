package Constants;

import Pages.BasePage;

public class Constants extends BasePage {
	
	public static String loginLinkId = "loginText";
	public static String userNameId = "userId";
	public static String PasswordId = "pwd";
	public static String captchaId = "nlpCaptchaImg";
	public static String captchaInputId = "nlpAnswer";
	public static String signInButtonXpath = "//button[text() = 'SIGN IN']";
	public static String otpLoginID =  "otpLogin";	
	public static String loginStatusCheckXpath =  "//*[contains(text(),'Welcome')]";
	public static String erorMessageXpath =  "//*[@class = 'loginError'][2]";
}