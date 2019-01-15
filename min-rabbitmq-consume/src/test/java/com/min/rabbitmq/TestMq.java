package com.min.rabbitmq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMq {
	    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        SimpleResponse consumer=(SimpleResponse) context.getBean("messageReceiver");
        context.close();
	}
}
