package com.min.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;


public class TestRabbitMQSend {
	public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = null;
        Channel channel = null;
        try
        {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("95.169.2.44");
            factory.setPort(27103);
            factory.setUsername("zblog");
            factory.setPassword("zblog@123");
            factory.setVirtualHost("zblogHost");
 
            //创建与RabbitMQ服务器的TCP连接
            connection  = factory.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare("firstQueue", true, false, false, null);
            String message = "First Message";           
            channel.basicPublish("", "firstQueue", null, message.getBytes());
            System.out.println("Send Message is:'" + message + "'");            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if(channel != null)
            {
                channel.close();
            }
            if(connection != null)
            {
                connection.close();
            }
        }
    }
}
