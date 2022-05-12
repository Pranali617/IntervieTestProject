package Logindemo;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	LoginSwag obj=new LoginSwag();
	obj.browserInitialization();

	Thread.sleep(4000);

	obj.loginswag("standard_user", "secret_sauce");
	Thread.sleep(4000);


	obj.closeBrowser();
	}

}
