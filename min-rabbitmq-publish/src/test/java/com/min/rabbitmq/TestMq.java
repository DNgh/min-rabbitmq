package com.min.rabbitmq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMq {
	    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        SimpleClient proceducer=(SimpleClient) context.getBean("simpleClient");
        String object = new String("ni hao haha ");
        proceducer.sendMessage(object);
        context.close();
	}
}
