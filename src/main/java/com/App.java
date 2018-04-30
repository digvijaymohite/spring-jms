
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import com.jms.dto.Message;

/**
 * The Class App.
 * 
 * @Digvijay
 */
@SpringBootApplication
@ComponentScan("com")
@EnableJms
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		System.out.println("[Sender] Sending message...");
		jmsTemplate.convertAndSend("jmsQueue", new Message("This is test message"));
	}

}
