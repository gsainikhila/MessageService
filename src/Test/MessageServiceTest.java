package Test;

import com.nikhila.MessageServiceConsumer.MessagingServiceConsumer;
import com.nikhila.MessageServiceInjector.FacebookMessageInjector;
import com.nikhila.MessageServiceInjector.WhatsappMessageInjector;

public class MessageServiceTest {
	
	public static void main(String[] args) {
		MessagingServiceConsumer messagingServiceConsumer=null;
		FacebookMessageInjector facebookMessageInjector=new FacebookMessageInjector();
		messagingServiceConsumer=facebookMessageInjector.MessagingApplication();
		messagingServiceConsumer.getMsg();
		
		
		WhatsappMessageInjector whatsappMessageInjector=new WhatsappMessageInjector();
		messagingServiceConsumer=whatsappMessageInjector.MessagingApplication();
		messagingServiceConsumer.getMsg();
		
		
		
		
		
		
	}

}
