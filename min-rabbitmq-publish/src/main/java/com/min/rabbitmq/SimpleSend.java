package com.min.rabbitmq;

import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * <p>Title: SimpleSend</p>
 * <p>Description: </p>
 * @author	zhouzm
 * @date	2019年1月13日
 * @version 1.0
 */
public class SimpleSend {	  
	  private final static String QUEUE_NAME = "hello";
		 
	  public static void main(String[] argv)throws java.io.IOException, TimeoutException {
		  ConnectionFactory factory = new ConnectionFactory();
		  factory.setUsername("username");
		  factory.setPassword("password");
		  factory.setHost("ip");
		  factory.setPort(5672);
		  factory.setVirtualHost("vhost");
		  Connection connection = factory.newConnection();
		  Channel channel = connection.createChannel();
		  channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		  String message = "Hello World!";
		  channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		  System.out.println(" [x] Sent '" + message + "'");
		  channel.close();
		  connection.close();
	  }
}
