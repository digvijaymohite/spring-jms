package com.jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.jms.dto.Message;

/**
 * The Class Receiver.
 * 
 * @Digvijay
 */
@Component
public class Receiver {

	/**
	 * Receive message.
	 *
	 * @param message
	 *            the message
	 */
	@JmsListener(destination = "jmsQueue", containerFactory = "myFactory")
	public void receiveMessage(Message message) {
		System.out.println("[Receiver] Message Received..");
		System.out.println(message.getMessage());
	}

}
