package com.nikhila.MessageServiceConsumer;


import com.nikhila.MessageServiceProvide.*;


public class MyMessagingServiceConsumer implements MessagingServiceConsumer {

	
	MessagingServiceProvider messagingSP;
	public MyMessagingServiceConsumer(MessagingServiceProvider messagingSP){
		this.messagingSP=messagingSP;
	}
	@Override
	public void getMsg() {
		// TODO Auto-generated method stub
		this.messagingSP.sendMsg();
		
	}

}
