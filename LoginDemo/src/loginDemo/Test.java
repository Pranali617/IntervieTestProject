package loginDemo;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	LoginScriptDemo obj=new LoginScriptDemo();
	obj.browserInitialization();

	Thread.sleep(4000);

	obj.loginswag("standard_user", "secret_sauce");
	Thread.sleep(4000);


	obj.closeBrowser();
	}

}