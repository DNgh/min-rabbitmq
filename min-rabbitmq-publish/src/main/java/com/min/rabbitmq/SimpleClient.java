package com.min.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleClient {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void sendMessage(Object message){
		Object object = amqpTemplate.convertSendAndReceive("exchangeTest", "queueTestKey", message);
			
		//发送消息到消息队列服务器中，并得到回馈内容
		/*Object object = amqpTemplate.convertSendAndReceive("queueTestKey", message, new MessagePostProcessor() {
			@Override
			public Message postProcessMessage(Message message) throws AmqpException {
				MessageProperties props = message.getMessageProperties();
                //把版本加入消息头中
//                props.setHeader("header", "1.0.0");
                props.setExpiration(String.valueOf(300000));
                logger.info("设置RPC消息的TTL为{}", 300000);
                return message;
			}
        });*/
      
      	try {
      		Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      	
      logger.info("对象:{}", object);
    }
}
