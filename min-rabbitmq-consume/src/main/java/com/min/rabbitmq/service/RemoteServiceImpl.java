package com.min.rabbitmq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.min.rabbitmq.api.Person;
import com.min.rabbitmq.api.RemoteService;

public class RemoteServiceImpl implements RemoteService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public String say(String msg) {
		logger.info("接收消息："+msg);
		
		String resp = new String("成功应答");
		return resp;
	}

	@Override
	public Person name(Person person) {
		logger.info("name:"+person.getName());
		person.setName("jack");
		return person;
	}

}
