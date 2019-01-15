package com.min.rabbitmq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.min.rabbitmq.api.RemoteService;

public class TestRPCServer {
	    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        context.close();
	}
}
