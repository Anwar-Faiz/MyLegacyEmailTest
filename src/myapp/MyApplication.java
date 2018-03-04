package myapp;
import legacy.EmailService;

public class MyApplication {
	private EmailService email = new EmailService();
	
	public void processMsg(String msg, String rec)
	{
		// do some validation over the message and the receiver address
		email.sendEmail(msg, rec);
	}
}
