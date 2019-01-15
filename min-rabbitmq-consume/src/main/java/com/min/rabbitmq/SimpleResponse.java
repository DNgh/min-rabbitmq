package com.min.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleResponse {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String processMsg(String msg) {
		logger.info("receive message:{}", msg);
		
		String response=new String("收到返回消息");
		return response;
	}
}
