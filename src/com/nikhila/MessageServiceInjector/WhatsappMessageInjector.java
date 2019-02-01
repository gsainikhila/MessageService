package com.nikhila.MessageServiceInjector;

import com.nikhila.MessageServiceConsumer.MessagingServiceConsumer;
import com.nikhila.MessageServiceConsumer.MyMessagingServiceConsumer;
import com.nikhila.MessageServiceProvide.FacebookMessageService;
import com.nikhila.MessageServiceProvide.WhatsappMessageService;


public class WhatsappMessageInjector implements MessagingServiceInjector {
	
	@Override
	public MessagingServiceConsumer MessagingApplication() {
		// TODO Auto-generated method stub
		MyMessagingServiceConsumer myMessagingServiceConsumer=new MyMessagingServiceConsumer(new WhatsappMessageService());
		
		return myMessagingServiceConsumer;
	}

}
