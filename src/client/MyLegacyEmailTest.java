package client;
import myapp.MyApplication;

public class MyLegacyEmailTest {
	
	public static void main(String [] args)
	{
		MyApplication app = new MyApplication();
		app.processMsg("This is test message!", "toughjamy@yahoo.com");
	}

}
